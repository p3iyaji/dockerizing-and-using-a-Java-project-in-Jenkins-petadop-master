pipeline {
  agent any 
  tools {
  	maven "MAVEN"
  }
  stages{
      stage("Clone the project") {
          steps{
            git branch: 'main', url: 'https://github.com/p3iyaji/petadop-master.git'
          }
      }

      stage("Compilation") {
          steps{
          	script{
          		sh 'mvn clean install'
          	}
            
          }
        
      }
    
      stage("build docker image") {
          steps{
              script{
                sh 'docker build -t petadoption .'
              }
            
          }
        
      }
    
      stage("create container"){
          steps{
              script{
                sh 'docker run -d -p 8081:8080 --name petadoptionapp petadoption:latest'
              }
            
          }
      }
    }
  

}
