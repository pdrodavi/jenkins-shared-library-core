import br.dev.pedrodavi.Constants

def call(String repo){

    inputNameRepo = input([
            message: 'Name of Repository',
            parameters: [
                    string(name: 'Input a name for repository')
            ]
    ])

    echo "Repository Name: ${inputNameRepo}"

    withCredentials([string(credentialsId: Constants.JENKINS_GITHUB_REST_CREDENTIALS_ID, variable: 'GITHUBRESTJWT')]) {
        sh "curl \\\n" +
                "  -X POST \\\n" +
                "  -H \"Accept: application/vnd.github+json\" \\\n" +
                "  -H \"Authorization: Bearer ${GITHUBRESTJWT}\"\\\n" +
                "  -H \"X-GitHub-Api-Version: 2022-11-28\" \\\n" +
                "  ${Constants.JENKINS_GITHUB_URL_API_REPOS} \\\n" +
                "  -d '{\"name\":\"${inputNameRepo}\",\"description\":\"This is your first repository\",\"homepage\":\"https://github.com\",\"private\":true,\"has_issues\":true,\"has_projects\":true,\"has_wiki\":true}'"
    }

}

