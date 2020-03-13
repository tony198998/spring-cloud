# spring-cloud
springCloud学习资料（其他资料比较繁琐，
而且都没有pom依赖继承，造成每个模块pom文件中相同的依赖一大堆，自己整合了下，
将工程最简化，适合搭建基础微服务平台）
目前还未继承数据库

# 该学习资料集成了
1、eureka：注册中心
2、ribbon：负载均衡（封装okhttp是一个封装URL,比HttpClient更友好易用的工具。目前似乎okhttp更流行一些。）
3、hytrix：服务熔断
4、feign：服务发现
5、zuul：gateway服务网关（包括服务过滤器）
6、config（服务端）  
7、config的客户端在cloud-item工程中
