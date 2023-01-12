FROM openjdk:8
EXPOSE 8084 8000
ADD target/docker-image-debugging.jar docker-image-debugging.jar

ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh","/entrypoint.sh"]