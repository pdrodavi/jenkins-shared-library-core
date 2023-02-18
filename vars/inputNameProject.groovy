def call() {

    inputName = input([
            message: 'Input Name Project',
            parameters: [
                    string(name: 'Name Project')
            ]
    ])

    echo "Nome do projeto: ${inputName}"
    env.NAMEPRJ = inputName
    echo "NOME: $NAMEPRJ"

}

