pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                // sh 'mvn -B -DskipTests clean package'
                sh "./mvnw -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
}