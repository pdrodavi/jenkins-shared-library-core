def call() {
    node {

        stage("Checkout") {
            gitCheckoutArchetypeSpring()
        }

        stage("Create Project") {
            createRepositoryFromArchetypeSpring()
        }

    }
}
