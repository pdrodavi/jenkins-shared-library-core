def call(Map args) {
    node {

        stage("Checkout") {
            gitCheckout(args.repo)
        }

        stage("Analysis") {
            scanSonar()
        }

        stage("Package") {
            packageArtifact()
        }

        stage("Build Image") {
            buildImageDocker()
        }

        stage("Publish") {
            publishToRegistry()
        }

        stage("Deploying") {
            startContainer()
        }

    }
}