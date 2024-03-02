An archetype for your microservice startup.
# how to publish to maven central
1. commented line: `<module>microservice-boot-maven-archetype-quickstart</module>`
2. go to the project root and then execute: `mvn clean deploy -P release_central`

# todo
- [ ] 日志文件的标准化
- [ ] 异常处理
- [ ] http接口response结构的标准化
- [ ] redis依赖处理：连接、缓存、锁
- [ ] zookeeper依赖处理：连接
- [ ] sofa-rpc的注册与发现标准化配置