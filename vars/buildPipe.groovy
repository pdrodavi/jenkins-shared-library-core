def call() {
    node {

        stage("Framework") {
            chooseFramework()
        }

        stage("Name Project") {
            inputNameProject()
        }

    }
}
