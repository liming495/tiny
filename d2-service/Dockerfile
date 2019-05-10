FROM java:8
VOLUME /tmp
ADD ./target/d2-service.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 10011
ENTRYPOINT ["java","-jar","/app.jar"]

ADD ../d3-service/target/d3-service.jar /d3-app.jar
RUN bash -c 'touch /d3-app.jar'
EXPOSE 10012
ENTRYPOINT ["java","-jar","/d3-app.jar"]