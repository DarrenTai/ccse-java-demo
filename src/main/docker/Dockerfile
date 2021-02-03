# 基础镜像使用java
FROM openjdk:12
# 作者
MAINTAINER Darren <caiyueyang@gmail.com>
# 将jar包添加到容器中并更名为app.jar
ADD ccse-cicd-demo-0.0.1-SNAPSHOT.jar app.jar
# 运行jar包
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]