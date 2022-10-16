properties([pipelineTriggers([githubPush()])])
pipeline{
    agent any
    

        stages {
            stage ('Hello') {
                steps {
                    echo 'Hello World ngrok !!!! '
                }
            }
            stage('Checkout GIT ') {
                steps {
                    echo 'Pulling ...';
                    git branch : 'main',
                    url : 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops';
                }
            }

        stage('git clone') {
                    steps {
                       git branch: 'main', url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops.git'
                    }
                }
                  stage('MVN CLEAN'){
                    steps {
                        sh 'mvn clean'
                    }
                }
                     stage('MVN COMPILE') {
                    steps {
                        sh 'mvn install'
                    }
                } 

  /* stage('Build Maven') {
            steps{

                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }
        }*/
                   

}
}

//////////////////////////////
/*
pipeline{
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build Maven') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*//*
main']], extensions: [], userRemoteConfigs: [[credentialsId: 'devopshint', url: 'https://github.com/devopshint/jenkins...]]])

                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  sh 'docker build -t devopshint/my-app-1.0 .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u devopshint -p ${dockerhubpwd}'
                 }
                 sh 'docker push devopshint/my-app-1.0'
                }
            }
        }
    }
} */

/*
checkout([$class: 'GitSCM', branches: [[name: '*//*
main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops']]])
 */
