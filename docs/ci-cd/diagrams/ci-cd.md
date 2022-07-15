# CI-CD process
## Description

Describing process of pushing code to git repository, verification, tests, review, build and deploy processes over that code.

## Goal

Ability to deliver features quickly to production with high quality and frequency 

## CI-CD steps

- developer machine -->
- push to git (compile, test, code-coverage)  --> 
- review (git)--> 
- merge --> 
- build (docker image build, docker image push --> (AWS-ECR)) --> 
- deploy (AWS-ECS)

## Instruments

<p>AWS-ECR for hosting docker container images<p>
<p>AWS-ECS for managing docker containers<p>
<p>Docker for containerization application<p>
<p>Github for storing source code and for version control<p>

## Diagrams

![CI-CD_process_diagram.png](CI-CD_process_diagram.png)
![CI-CD_process_diagram.drawio](CI-CD_process_diagram.drawio)

