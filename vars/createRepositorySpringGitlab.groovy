def call() {
    node {

        stage("Checkout") {
            agent none
            gitCheckoutGitlab()
        }

        stage("Create Project") {
            agent none
            createRepositoryGitlab()
        }

    }
}
