pipeline {
    options {
        skipDefaultCheckout()
        timestamps()
        buildDiscarder logRotator(artifactDaysToKeepStr: '',
                artifactNumToKeepStr: '10',
                daysToKeepStr: '',
                numToKeepStr: '10')

    }
    agent any
    
    stages {
        stage("foo") {
            agent any

            steps {
                
                echo "Epic change..."
                echo "Test change..."
            }
        }
    }
}
