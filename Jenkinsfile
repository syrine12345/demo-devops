pipeline {

    agent any

    stages {

        stage('Clone Code') {
     
            steps {
                git branch: 'main', url: 'https://github.com/syrine12345/demo-devops.git'
            }
        }
        
        stage('JUnit Test') {
     
            steps {
                bat "mvn test"
            }
        }


        

    }
}        
