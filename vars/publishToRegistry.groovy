def call() {

    inputPublish = input([
            message: 'Publish to Registry?',
            parameters: [
                    choice(name: 'Publish', choices: ['Yes', 'No'], description: 'Publish image to artifactory')
            ]
    ])

    if ("${inputPublish}" == 'Yes') {
        withDockerRegistry(credentialsId: 'JFROG-PLATAFORM', url: 'https://srvextechnology.jfrog.io/artifactory/registry-docker/') {
            sh "docker tag ${env.JOB_BASE_NAME} srvextechnology.jfrog.io/registry-docker/${env.JOB_BASE_NAME}:latest"
            sh "docker push srvextechnology.jfrog.io/registry-docker/${env.JOB_BASE_NAME}:latest"
        }
    } else {
        echo 'Step Skipped'
    }

}
