FROM java:8
VOLUME /tmp
ADD ./target/d3-service.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 10012
ENTRYPOINT ["java","-jar","/app.jar"]