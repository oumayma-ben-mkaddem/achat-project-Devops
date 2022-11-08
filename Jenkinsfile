properties([pipelineTriggers([githubPush()])])
pipeline {
  agent any
  tools {
    maven 'M2_HOME'
  }
  environment {
    registry = "oumaymabenmkadem/achat-test"
    registryCredential = 'dockerhub-id'
    dockerImage = ''
    
  }

  stages {
    stage('git clone') {
      steps {
        git branch: 'main', url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops.git'
      }
    }
    /* stage('Checkout GIT ') {
         steps {
             echo 'Pulling ...';
             git branch : 'main',
             url : 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops';
         }
     }*/
    stage('MVN CLEAN') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('MVN INSTALL') {
      steps {
        sh 'mvn install'
      }
    }

    /*stage('sonarQube analysis') {
      steps {
        withSonarQubeEnv('sonarqube-8.9.7') {
          sh "mvn sonar:sonar"
        }

      }
    }*/
    stage('Junit/Mockito') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Nexus') {
      steps {
        sh 'mvn deploy -DskipTests -X'
      }
    }
    /*  stage('Building our image') { 
            steps { 
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }*/
    /*stage('Deploy our image') { 
        steps { 
            script { 
                docker.withRegistry( '', registryCredential ) { 
                    dockerImage.push() 
                }
            } 
        }
    } 
    stage('Cleaning up') { 
        steps { 
            sh "docker rmi $registry:$BUILD_NUMBER" 
        }
    }*/

    /*  stage('git clone') {
                  steps {
                     git branch: 'main', url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops.git'
                  }
              }*/

    /* stage('MVN CLEAN'){
                    steps {
                        sh 'mvn clean'
                    }
                }
                     stage('MVN COMPILE') {
                    steps {
                        sh 'mvn install'
                    }
                } 
  
        }*/

    /*stage('Build Docker Image') {
               steps {
                   script {
                     sh 'docker build -t devopsachat/myapp '
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
                checkout([$class: 'GitSCM', branches: [[name: '*/
/*
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
checkout([$class: 'GitSCM', branches: [[name: '*/
/*
main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops']]])
 */