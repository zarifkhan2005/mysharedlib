def call(String status, String recipient) {

    if (status == 'SUCCESS') {
        emailext(
            from: 'zk8549170@gmail.com',
            to: recipient,
            subject: 'Build Successful',
            body: 'Good: Your build was successful.'
        )
    } else if (status == 'FAILURE') {
        emailext(
            from: 'zk8549170@gmail.com',
            to: recipient,
            subject: 'Build Failed',
            body: 'Bad news: Your build failed.'
        )
    }
}
