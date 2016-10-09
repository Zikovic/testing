stage 'build'
node{
    checkout scm
    bat 'mvn clean install'
}


stage 'Test integration'
node{
    bat 'mvn integration-test'
}
