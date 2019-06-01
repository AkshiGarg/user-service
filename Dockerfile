FROM openjdk:8-jdk-alpine

COPY ${build.finalName}.jar /var/lib/nagp/user-service/service.jar
COPY config.yml /etc/nagp/user-service/config.yml
ADD run_service.sh /etc/nagp/user-service/run_service.sh

EXPOSE 8080 8081

WORKDIR /etc/nagp/user-service
VOLUME /etc/nagp/user-service
VOLUME /var/lib/nagp/user-service

CMD java -jar /var/lib/nagp/user-service/service.jar db migrate /etc/nagp/user-service/config.yml && java -jar /var/lib/nagp/user-service/service.jar server /etc/nagp/user-service/config.yml
