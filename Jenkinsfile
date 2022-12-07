pipeline {

    agent any

    tools {
            jdk 'JDK11'
            maven 'Maven:3'
        }

    stages {

        stage('Clone Code') {
     
            steps {
                checkout scm
            }
        }


        stage('Sonar analysis') {
            
            steps {
                withSonarQubeEnv('sonarqube-1') {
                    configFileProvider([configFile(fileId: 'maven-settings', variable: 'MAVEN_SETTINGS')]) {
                        sh "mvn  -X -s $MAVEN_SETTINGS clean verify sonar:sonar  "
                    }
                }
            }
        }


        stage('package application') {
     
            steps {
                configFileProvider([configFile(fileId: 'maven-settings', variable: 'MAVEN_SETTINGS')]) {
                        sh "mvn -X -s $MAVEN_SETTINGS clean deploy"
                }
            }
        }


    }
}        