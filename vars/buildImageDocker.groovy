def call() {
    echo "Criando a imagem Docker"
    sh "docker build -t ${env.JOB_BASE_NAME} ."
}