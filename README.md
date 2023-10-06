## dockerizing-javaSpringBoot-mySQL-angular-system

## Backend
- before build (we need jar file created)
```
mvn clean package
```

- (build image) go to root directory where Dockerfile file is saved in
```
docker build -t testdocker .
```

- Create a container from image
```
docker run -p 8081:8080 testdocker
```
<br>


## Frontend
- docker build command
```
docker build . -t angulardockertest
```

- create a container from image above
```
docker run -p 8081:80 angulardockertest
```

<br>

## Start Up docker compose with all containers
```
docker-compose down && docker-compose build --no-cache && docker-compose up
```

<br>
## Docker utils
- remove all containers
```
docker container rm $(docker container ls -aq)
```
<br>
## Docker utils
- stop all containers
```
docker stop $(docker ps -q)
```

- remove all containers
```
docker container rm $(docker container ls -aq)
```
