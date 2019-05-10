FROM java:8
VOLUME /tmp
ADD ./target/d1-service.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 10010
ENTRYPOINT ["java","-jar","/app.jar"]