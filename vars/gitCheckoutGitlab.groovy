import br.dev.pedrodavi.Constants

def call(){
    agent none
    log("info", "Clonando repositório do Archetype")
    git branch: "main", credentialsId: Constants.JENKINS_GITLAB_CREDENTIALS_ID, url: "https://gitlab.com/srvexbr/archetypes/spring-boot/backend/api-rest-spring-boot-archetype.git"
    sh "rm -r .git"
    sh "mvn clean install"
    sh "ls -la"
    sh "pwd"
    cleanWs()
}

