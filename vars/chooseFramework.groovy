def call() {

    inputFramework = input([
            message: 'Choose Framework',
            parameters: [
                    choice(name: 'Framework', choices: ['Spring', 'Quarkus'], description: 'Framework Stack to Pipeline')
            ]
    ])

    if ("${inputFramework}" == 'Spring') {
        echo "Framework selecionado: ${inputFramework}"
    } else if ("${inputFramework}" == 'Quarkus') {
        echo "Framework selecionado: ${inputFramework}"
    } else {
        echo 'Step Skipped'
    }

}
