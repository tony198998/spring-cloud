FROM java:8
USER root
COPY cloud-order/target/cloud-order.jar  /usr/docker/
ENV JAVA_OPTS='-Xms1024M -Xmx1024M -XX:MetaspaceSize=128m -XX:MaxMetaspace=128m'
ENV LANG=en_US.UTF-8
#启动脚本
ENTRYPOINT [ "sh","-c","java $JAVA_OPTS -jar /usr/java/cloud-order.jar" ]