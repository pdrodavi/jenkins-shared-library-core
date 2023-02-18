def call() {
    node {

        stage("Checkout") {
            log("debug", "Entrou no checkout")
            agent none
            gitCheckoutGitlab()
        }

        stage("Create Project") {
            log("debug", "Entrou no Create")
            createRepositoryGitlab()
        }

    }
}
