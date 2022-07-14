# CI-CD process
## Description

Description of CI-CD process of current app

##Goal

Ability to deliver features quickly to production with high quality and frequency 

##CI-CD steps

developer machine --> push to git (compile, test, code-coverage)  --> review (git) 
--> merge --> build (docker image build, docker image push --> (AWS-ECR)) --> deploy (AWS-ECS)

##Instruments

AWS-ECR, AWS-ECS, Docker, Github, Jenkins

## Diagrams

![cicd image.png](cicd%20image.png)

