def call() {
    node {

        stage("Framework") {
            chooseFramework()
        }

    }
}
