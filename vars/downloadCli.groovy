def call() {

    echo "http://host.docker.internal:8080/jnlpJars/jenkins-cli.jar"
    sh "curl -# -O http://host.docker.internal:8080/jnlpJars/jenkins-cli.jar"
    sh "pwd"
    sh "ls -la"
//    sh "java -jar jenkins-cli.jar -s http://host.docker.internal:8080/ -auth devops:11820e9b79637e6ae7cf649428d97b4352 -webSocket help"

    withCredentials([string(credentialsId: 'cli-jenkins-token', variable: 'JENKINSCLITOKEN')]) {
        sh "java -jar jenkins-cli.jar -s http://host.docker.internal:8080/ -auth devops:${JENKINSCLITOKEN} -webSocket help"
    }

    echo "${env.NAME-PROJECT}"

}

