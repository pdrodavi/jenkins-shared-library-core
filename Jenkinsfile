library identifier: 'jenkins-shared-library-core@main', retriever: modernSCM(
  [$class: 'GitSCMSource',
    remote: 'https://github.com/pdrodavi/jenkins-shared-library-core.git'
  ])

pipeline {

  agent any
  
  tools {
    maven "M3"
  }

  stages {

    stage('Initialize') {
      steps {
        cleanWs()
        buildJavaSpringDocker(repo: "app-job-deploy-sb")
      }
    }


  }
}
