pipeline {

    agent any
    
     tools {
            jdk 'JDK11'
            maven 'Maven:3'
        }


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
        
        stage('Integration testing'){

            steps{

                   script{

                         bat "mvn verify -DskipUnitTests"
                   }
            }
        }
        
        stage('Maven build'){

            steps{
                
                script{
                     bat "mvn clean install"
                }
           
            }
        }

        

    }
}        
