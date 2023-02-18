def call() {
    node {

        stage("Framework") {
            chooseFramework()
        }

        stage("Name Project") {
            inputNameProject()
        }

        stage("Download CLI") {
            downloadCli()
        }

    }
}
