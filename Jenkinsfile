stage 'test docker build'
node{
    docker.withServer('tcp://192.168.99.101:2376'){
        docker.image('maven:3-jdk-8').pull()

    }



}


/
stage 'build'
node{
    checkout scm
    bat 'mvn clean install'
}


stage 'Test integration'
node{
    bat 'mvn integration-test'
}