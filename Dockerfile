FROM hub.ihr.local/java:1.8

VOLUME /tmp
WORKDIR /opt/
ADD ./build/libs/*.jar app.jar
RUN sh -c 'touch app.jar'

ENV JAVA_OPTS="-Xmx512m"
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -XX:+PrintFlagsFinal -XX:+PrintGCDetails $JAVA_OPTS -Duser.timezone=GMT+08 -Djava.security.egd=file:/dev/./urandom -jar app.jar"]
