def call() {
    node {

        stage("Checkout") {
            log("debug", "Entrou no checkout")
            gitCheckoutGitlab()
        }

        stage("Create Project") {
            log("debug", "Entrou no Create")
            createRepositoryGitlab()
        }

    }
}
