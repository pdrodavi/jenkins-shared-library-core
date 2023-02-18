def call() {
    sh "docker rm -f ${env.JOB_BASE_NAME}"
    sh "docker container create --name=${env.JOB_BASE_NAME} --memory=256MB --memory-reservation=256MB --network=bridge --env-file=${env.WORKSPACE}/.env --restart=always --publish-all ${env.JOB_BASE_NAME}:latest"
    sh "docker container start ${env.JOB_BASE_NAME}"
    cleanWs()
}
