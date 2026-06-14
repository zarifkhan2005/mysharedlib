def call(String serviceName) {

    echo "Deploying ${serviceName}"

    sh """
        docker compose up -d --build ${serviceName}
    """

    echo "Application deployed successfully"
}
