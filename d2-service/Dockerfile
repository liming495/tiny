FROM java:8
VOLUME /tmp
ADD ./target/d2-service.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 10011
ENTRYPOINT ["java","-jar","/app.jar"]