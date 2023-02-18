import br.dev.pedrodavi.Constants

def call(){
    log("info", "Clonando repositório do Archetype")
    git branch: "main", credentialsId: Constants.JENKINS_GITHUB_CREDENTIALS_ID, url: "https://github.com/Srvex/archetype-spring-boot-api.git"
    sh "rm -r .git"
    sh "mvn clean install"
    sh "ls -la"
    sh "pwd"
    cleanWs()
}

