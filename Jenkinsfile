properties([pipelineTriggers([githubPush()])])
pipeline {
  agent any
  tools {
    maven 'M2_HOME'
  }
  environment {
    registry = "oumaymabenmkadem/achat"
    registryCredential = 'dockerhub-cred-devops'
    dockerImage = ''

  }

  stages {
    stage('git clone') {
      steps {
        git branch: 'main', url: 'https://github.com/oumayma-ben-mkaddem/achat-project-Devops.git'
      }
    }

    stage('MVN INSTALL') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Junit/Mockito') {
      steps {
        sh 'mvn test'
      }
    }

    stage('sonarQube analysis') {
      steps {
        withSonarQubeEnv('sonarqube-8.9.7') {
          sh "mvn sonar:sonar \
  		        -Dsonar.projectKey=devops-project \
 			    -Dsonar.host.url=http://192.168.1.9:9000 \
                -Dsonar.login=93119ee3376d747389d2d527d09567cade5a3c44"
                }
      }
    }

    stage('NEXUS DEPLOY') {
      steps {
        script {
          nexusPublisher nexusInstanceId: 'nexus', nexusRepositoryId: 'achat', packages: [
            [$class: 'MavenPackage', mavenAssetList: [
              [classifier: '', extension: '', filePath: 'target/achat-1.0.jar']
            ], mavenCoordinate: [artifactId: 'achat', groupId: 'tn.esprit.rh', packaging: 'jar', version: '1.0']]
          ]
        }
      }
    }

    stage('Building our image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    
    stage('Deploy our image') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
            dockerImage.push()
          }
        }
      }
    }

    stage('Docker compose build') {
      steps {
        sh "docker-compose build"
      }
    }
    
    stage('Docker compose up') {
      steps {
        sh "docker-compose up -d"
      }
    }

 /*   stage('Cleaning up') { 
        steps { 
            sh "docker rmi $registry:$BUILD_NUMBER" 
        }
    }*/
  }
}