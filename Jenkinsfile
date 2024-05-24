pipeline {
    agent any
    environment {
        DB_PASSWORD = credentials('db-password-placeholder')
        API_KEY = credentials('api-key-placeholder')    // Ensure this matches the ID of your credentials in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Cappybara12/AMRIT'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        // stage('Database Migrations') {
        //     steps {
        //         sh 'mvn flyway:migrate'
        //     }
        // }
        // stage('Deploy to WildFly') {
        //     steps {
        //         deployToWildFly()
        //     }
        // }
    }
}

def deployToWildFly() {
    sh '''
    # Adjust the following path to match your WildFly deployment directory
    cp target/common-api.war /path/to/wildfly/standalone/deployments/
    '''
}
