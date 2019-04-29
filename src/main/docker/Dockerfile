FROM java:8
VOLUME /tmp
ADD config-client-0.0.1-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
RUN echo "Asia/shanghai" > /etc/timezone
EXPOSE  8008
ENTRYPOINT ["java","-Dfile.encoding=UTF-8","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]