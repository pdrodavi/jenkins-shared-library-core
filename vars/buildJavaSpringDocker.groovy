def call(Map args) {
    node {
        stage("Checkout") {
            gitCheckout(args.repo)
        }

        stage("Compile") {
//            sh "./mvnw clean compile"
            echo "Compile"
        }

        stage("Unit Test") {
//            sh "./mvnw test"
            echo "Unit Test"
        }

        stage("Integration Test") {
//            sh "./mvnw verify"
            echo "Integration Test"
        }

        stage("Static Code Analysis: Sonar") {
            echo "Running static code analysis using Sonar"
//            withSonarQubeEnv(credentialsId: Constants.SONARQUBE_CREDENTIALS_ID, installationName: Constants.SONARQUBE_INSTALLATION_NAME) {
//                sh './mvnw sonar:sonar'
//            }
        }

        stage("Package Artifact Jar") {
//            sh "./mvnw package -DskipTests=true"
            echo "Package"
        }

//        def dockerEcr = new DockerEcr(this)

        stage("Build Docker Image") {
//            dockerEcr.buildDockerImage("${args.microserviceName}")
            echo "Build Docker Image"
        }

        stage("Publish Docker Image") {
//            dockerEcr.publishDockerImageToECR("${args.microserviceName}")
            echo "Publish Docker Image"
        }

        stage("Deploying to Dev") {
            echo "Deploying to Dev environment"
        }
    }
}
