def call() {

    inputAnalysis = input([
            message: 'Analysis SonarQube?',
            parameters: [
                    choice(name: 'Analysis', choices: ['Yes', 'No'], description: 'Run on specific analysis')
            ]
    ])

    if ("${inputAnalysis}" == 'Yes') {
        withSonarQubeEnv('sonarqube') {
            echo env.WORKSPACE
            sh "mvn -B clean verify sonar:sonar"
        }
        def qualitygate = waitForQualityGate()
        if (qualitygate.status != "OK") {
            cleanWs()
            error "Pipeline aborted due to quality gate failure: ${qualitygate.status}"
        }
    } else {
        echo 'Step Skipped'
    }

}