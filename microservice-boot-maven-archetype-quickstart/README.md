# how to use

1. build project and install the archetype to local by executing `build-archetype.sh`
2. go to you workspace and then generate the project by executing `mvn archetype:generate -DarchetypeCatalog=local`

# QA

1. 为什么provider和domain不合并在一起：domain 只定义对外部服务提供的入参和出参领域对象，由于某些只提供http接口的服务
   是不需要接口定义的，但是对应又有rpc服务，所以区分开。

