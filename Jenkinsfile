
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
                     stage('MVN INSTALL') {
                    steps {
                        sh 'mvn install'
                    }
                }

}