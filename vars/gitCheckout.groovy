def call(){

    inputBranch = input([
            message: 'Input branch',
            parameters: [
                    string(name: 'Input branch')
            ]
    ])

    echo "Branch selecionada: ${inputBranch}"

    return inputBranch

}
