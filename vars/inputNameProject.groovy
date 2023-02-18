def call() {

    inputName = input([
            message: 'Input Name Project',
            parameters: [
                    string(name: 'Name Project')
            ]
    ])

    echo "Nome do projeto: ${inputName}"

    pipelineJob(${inputName}) {
        definition {
            cpsScm {
                scm {
                    git('https://github.com/jenkinsci/job-dsl-plugin.git')
                }
            }
        }
    }

}

