## Inbox Application

Mentoring GL program


Local usage

## Getting started with docker-compose.yml
These instructions will get you through the bootstrap phase of creating and deploying samples of containerized applications with Docker Compose.

Installation instructions can be found here:
- Windows or macOS:
  [Install Docker Desktop](https://www.docker.com/get-started)
- Linux: [Install Docker](https://docs.docker.com/desktop/install/linux-install/) and then
  [Docker Compose](https://github.com/docker/compose) (**_if you have a Linux you know how to install all this ~~xD~~_**)

If you need more information, see Docker Compose docs: [Docker Compose documentation](https://docs.docker.com/compose/)

### Running a sample

The environment directory of each sample contains the `docker-compose.yaml` which
describes the configuration of service components. All samples can be run in
a local environment by going into the root directory of each one and executing:

```console
docker-compose up -d --build
```


To stop and remove all containers of the sample application run:

```console
docker-compose down
```


The compose file defines an application with `PostgresDB` service.
When deploying the file, docker-compose maps port 5432 of the DB service container to port 5432 of the host as specified in the file.
Make sure port 5432 on the host is not already being in use.