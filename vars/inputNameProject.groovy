def call() {

    inputName = input([
            message: 'Input Name Project',
            parameters: [
                    string(name: 'Name Project')
            ]
    ])

    echo "Nome do projeto: ${inputName}"

    environment {
        NAME-PROJECT = "${inputName}"
    }

}

