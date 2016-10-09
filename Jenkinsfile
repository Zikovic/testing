stage 'test docker build'
node{

    docker.image('maven:3-jdk-8').inside('-v /.m2:/root/.m2') {
            sh 'mvn clean install'
    }


}



stage 'build'
node{
    checkout scm
    bat 'mvn clean install'
}


stage 'Test integration'
node{
    bat 'mvn integration-test'
}