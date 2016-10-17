stage 'test docker build'
node{
    docker.withServer('tcp://192.168.99.103:2376', 'swarm-certs') {
      docker.image('httpd').withRun('-p 8080:80') {c ->
        sh "curl -i http://192.168.99.103:8080/"
      }
    }
}
