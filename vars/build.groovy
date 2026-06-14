def call(String imageName) {

    echo "Building Docker image: ${imageName}"

    sh """
        docker build -t ${imageName}:latest .
    """

    echo "Image built successfully"
}
