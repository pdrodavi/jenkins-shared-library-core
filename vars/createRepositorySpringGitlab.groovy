def call() {
    node {

        stage("Checkout") {
            gitCheckoutGitlab()
        }

        stage("Create Project") {
            createRepositoryGitlab()
        }

    }
}
