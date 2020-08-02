FROM openjdk:16-slim
ADD ./target/rest-service.jar /app/rest-service.jar
ADD runboot.sh /app/
WORKDIR /app
RUN chmod a+x runboot.sh
CMD /app/runboot.sh
