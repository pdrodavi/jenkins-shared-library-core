def call() {
    echo "Realizando construção do artefato"
    sh "mvn -Dmaven.test.skip=true -Dmaven.test.failure.ignore clean package"
}