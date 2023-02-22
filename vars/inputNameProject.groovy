def call() {

    inputName = input([
            message: 'Input Name Project',
            parameters: [
                    string(name: 'Name Project')
            ]
    ])

    echo "Nome do projeto: ${inputName}"
    echo "GIT: https://git.example.com.br/devops/${inputName}.git"
    echo "Pipeline: https://jenkins.example.com.br/job/${inputName}/"

}

