@Library('devops-pipelines-libraries') _

def flow = new com.rappipay.util();

pipeline {

    agent { node { label '!master' } }

    stages {
        stage('AUTOMATION CI') {
            steps {
                script {

                    flow.init()

                    flow.wstage("Test", {
                        sh 'docker-compose run --rm test'
                    })

                    flow.wstage("Sonar", {
                        flow.sonarAnalysis();
                    })

                    if (env.BRANCH_NAME == "master") {

                        flow.wstage("########### Upload to Nexus ############", {
                            sh 'docker-compose run --rm publishToNexus'
                        })

                        flow.wstage("########### Notify Project  ############", {
                            sh 'docker-compose run --rm notifyProject'
                        })

                        flow.wstage("########### Notify to S3  ############", {
                            sh 'docker-compose run --rm publishToS3'
                        })

                    }

                    flow.wstage("Teardown", {
                        sh 'docker-compose down -v'
                    })

                    flow.end()
                }
            }
        }
    }
    post {
        always {
            sh "sudo chmod -R 777 ."
            cleanWs()
            deleteDir()
        }
    }
}
