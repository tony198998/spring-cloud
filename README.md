# spring-cloud
springCloud学习资料（其他资料比较繁琐，
而且都没有pom依赖继承，造成每个模块pom文件中相同的依赖一大堆，自己整合了下，
将工程最简化，适合搭建基础微服务平台）
目前还未继承数据库

注：
版本不能用太高，否則會出現各種錯誤   
1.spring cloud 版本改为：Finchley.RELEASE   
2.srping boot版本改为：2.0.3（Finchley.RELEASE对应的spring boot版本）    

# 该学习资料集成了
1、eureka：注册中心  
2、ribbon：负载均衡（封装okhttp是一个封装URL,比HttpClient更友好易用的工具。目前似乎okhttp更流行一些。）
3、hytrix：服务熔断  
4、feign：服务发现  
5、zuul：gateway服务网关（包括服务过滤器）  
6、config（服务端）    
7、config的客户端在cloud-item工程中  
8、actuator 监控中心可以实现config配置数据的实时刷新     
9、网关的路由机制加入配置中心中，支持动态读取，可实时下发配置  
10、Cloud Bus消息总线：基于mq的订阅发布，（实现了对RabbitMQ以及Kafka的支持），在config-server中添加  force-pull: true，  
curl -X POST http://localhost:7788/actuator/bus-refresh，从配置中心拉取配置  
11、整合swagger ，登录页面：http://localhost:8081/swagger-ui.html  
12、整合zipkin，虽然springboot2.x以后已不推荐自己搭建zipkin服务端，而是用jar包启动，
本例自己搭建了服务端，但要加management.metrics.web.server.auto-time-requests=false，否则请求报错，
请求http://localhost:9411/zipkin/   


# 后续，docker容器化部署
##步骤：
1、编写dockerfile  
2、在宿主目标机上拉取docker  
3、配置docker镜像中心    
4、镜像：docker images  运行中的镜像：docker ps    
5、打镜像包： docker build -t 镜像名 . (docker build -t cloud-eureka .)   
6、启动镜像： sudo docker run -p 8081:8081[端口映射] 镜像名 (sudo docker run  -p 8100:8100 cloud-eureka)

##限流：sentinel
sentinel模块，只需启动sentinel的jar包，打开dashboard界面，
见resource资源文件下的sentinel的jar包
pom中引入依赖
<!--sentinel启动器-->
<dependency>
<groupId>com.alibaba.cloud</groupId>
<artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
<version>2.1.1.RELEASE</version>
</dependency>

配置文件中
spring:
application:
name: WXL-DEV-SERVICE-2
cloud:
sentinel:
transport:
dashboard: 127.0.0.1:8858


参见文档：
https://blog.csdn.net/qq_50909707/article/details/123863348