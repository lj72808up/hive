Apache Hive (branch 2.3)
================
[![Master Build Status](https://travis-ci.org/apache/hive.svg?branch=master)](https://travis-ci.org/apache/hive/branches)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.hive/hive/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.apache.hive%22)

#### Requirements
- Java 1.7 or 1.8
- Hadoop 2.x


jps 里 runjar 显示的 hive 3个组件
=========
```bash
[root@10 ~]# jps
10336 RunJar
10325 RunJar
352376 RunJar

# RunJar 执行 org.apache.hadoop.hive.metastore.HiveMetaStore
# RunJar 执行 org.apache.hive.service.server.HiveServer2
# RunJar 执行 org.apache.hive.hcatalog.templeton.Main

[root@10 ~]# ps -ef | grep 10336
hadoop    10336      1  0 May10 ?        01:15:42 /usr/local/jdk/bin/java -Xmx4096m -Dlog4j2.formatMsgNoLookups=true -Dlog4j.formatMsgNoLookups=true -Dwebhcat.log.dir=/data/emr/hive/logs -Dlog4j.configurationFile=file:///usr/local/service/hive/hcatalog/sbin/../etc/webhcat/webhcat-log4j2.properties -Djava.net.preferIPv4Stack=true -Dhadoop.log.dir=/data/emr/hdfs/logs -Dhadoop.log.file=hadoop-hadoop.log -Dhadoop.home.dir=/usr/local/service/hadoop -Dhadoop.id.str=hadoop -Dhadoop.root.logger=WARN,DRFA -Djava.library.path=/usr/local/service/hadoop/lib/native -Dhadoop.policy.file=hadoop-policy.xml -Djava.net.preferIPv4Stack=true -Xmx4096m -Xms1024m -Dhadoop.security.logger=WARN,DRFA,console org.apache.hadoop.util.RunJar /usr/local/service/hive/hcatalog/sbin/../share/webhcat/svr/lib/hive-webhcat-2.3.9.jar org.apache.hive.hcatalog.templeton.Main
root     852582 806923  0 17:10 pts/0    00:00:00 grep --color=auto 10336
[root@10 ~]# ps -ef | grep 10325
hadoop    10325      1  0 May10 ?        10:43:11 /usr/local/jdk/bin/java -Xmx4096m -Dlog4j.configurationFile=file:///usr/local/service/hive/conf/hive-metastore-log4j2.properties -server -Djava.net.preferIPv4Stack=true -Dhadoop.log.dir=/data/emr/hdfs/logs -Dhadoop.log.file=hadoop-hadoop.log -Dhadoop.home.dir=/usr/local/service/hadoop -Dhadoop.id.str=hadoop -Dhadoop.root.logger=WARN,DRFA -Djava.library.path=/usr/local/service/hadoop/lib/native -Dhadoop.policy.file=hadoop-policy.xml -Djava.net.preferIPv4Stack=true -Xmx4096m -Xms1024m -Dproc_metastore -Xmx4096m -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=7017 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=50M -Xloggc:/data/emr/hive/logs/gc_hive_metastore.log -Xms8g -Xmx16g -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:GCPauseIntervalMillis=600 -XX:G1HeapRegionSize=8M -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintGCDetails -Xloggc:/data/emr/hive/logs/hiveserver2gc.log -XX:-UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=32M -XX:MaxDirectMemorySize=1g -XX:CompressedClassSpaceSize=256m -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -Dlog4j2.formatMsgNoLookups=true -Dlog4j.formatMsgNoLookups=true -Djava.util.logging.config.file=/usr/local/service/hive/conf/parquet-logging.properties -Dhadoop.security.logger=WARN,DRFA,console org.apache.hadoop.util.RunJar /usr/local/service/hive/lib/hive-metastore-2.3.9.jar org.apache.hadoop.hive.metastore.HiveMetaStore
root     852892 806923  0 17:11 pts/0    00:00:00 grep --color=auto 10325
[root@10 ~]# ps -ef | grep 352376
hadoop   352376      1 19 Aug10 ?        5-18:03:35 /usr/local/jdk/bin/java -Xmx4096m -Djava.net.preferIPv4Stack=true -Dhadoop.log.dir=/data/emr/hdfs/logs -Dhadoop.log.file=hadoop-hadoop.log -Dhadoop.home.dir=/usr/local/service/hadoop -Dhadoop.id.str=hadoop -Dhadoop.root.logger=WARN,DRFA -Djava.library.path=/usr/local/service/hadoop/lib/native -Dhadoop.policy.file=hadoop-policy.xml -Djava.net.preferIPv4Stack=true -Xmx4096m -Xms1024m -Dproc_hiveserver2 -Xmx4096m -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=50M -Xloggc:/data/emr/hive/logs/gc_hive_hiveserver2.log -Xms32g -Xmx32g -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -XX:G1HeapRegionSize=16M -XX:+UnlockExperimentalVMOptions -XX:G1OldCSetRegionThresholdPercent=20 -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintGCDetails -Xloggc:/data/emr/hive/logs/hiveserver2gc.log -XX:-UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=32M -XX:MaxDirectMemorySize=1g -XX:CompressedClassSpaceSize=256m -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -Dlog4j2.formatMsgNoLookups=true -Dlog4j.formatMsgNoLookups=true -Djava.util.logging.config.file=/usr/local/service/hive/conf/parquet-logging.properties -Dhadoop.security.logger=WARN,DRFA,console org.apache.hadoop.util.RunJar /usr/local/service/hive/lib/hive-service-2.3.9.jar org.apache.hive.service.server.HiveServer2 --hiveconf hive.aux.jars.path=file:///usr/local/service/hive/auxlib/alluxio-2.8.0-client.jar,file:///usr/local/service/hive/auxlib/hive-hbase-handler-2.3.9.jar,file:///usr/local/service/hive/auxlib/hive-hcatalog-core-2.3.9.jar,file:///usr/local/service/hive/auxlib/hudi-hadoop-mr-bundle-0.11.0.jar,file:///usr/local/service/hive/auxlib/json-serde-1.3.8.jar,file:///usr/local/service/hive/auxlib/libfb303-0.9.3.jar
root     852976 806923  0 17:11 pts/0    00:00:00 grep --color=auto 352376
```

如果把Hive整体当做一个黑盒，则它的输入是用户提交的sql，它的输出是提交后的MR作业，用一句概括Hive的功能就是：将sql语句“转译”成MR作业，这实际上也正是HiveServer2的主要工作内容。更加细致一点的表述是：一般客户端会使用Hive的JDBC驱动连接到Hiveserver2（Hiveserver2通过Thrift RPC框架实现的JDBC服务端），然后将SQL语句提交给Hiveserver2，Hiveserver2会进行SQL的解析、编译和优化，在这个过程中Hiveserver2需要跟HiveMetastore服务通信以得到数据库和数据表的元数据，HiveMetastore服务会将数据库的元数据信息存储到数据库中。最终Hiveserver2将SQL编译为MapReduce作业运行在MapReduce/Tez/Spark分布式计算引擎上。HiveMetastore和HiveServer2都是独立运行的服务，对外提供基于Thrift协议的服务接口。网址:yii666.com<

hiveserver2 
=========
#### 1. Beeline 提交 sql 到 hiveserver2 流程
`Beeline.begin()` 获取用户在命令行键入内容的 reader 对象，
=> 调用 `Beeline.dispatch()` 解析 reader 读到的 sql 语句  
=> 调用 `Commands.sql()` 执行 sql 语句   
=> `Commands.executeInternal` 里执行 jdbc，链接 hiveserver2 执行查询       
jdbc 本质上是一套接口，这套接口的远程调用执行，在 beeline 中是通过 thrift rpc 调用的
```java
// 执行 jdbc 去 server 端查询
private boolean executeInternal(String sql, boolean call) {
    ... ...
    // jdbc 的模板代码
    if (stmnt instanceof HiveStatement) {
      HiveStatement hiveStatement = (HiveStatement) stmnt;
      hiveStatement.setInPlaceUpdateStream(
          new BeelineInPlaceUpdateStream(
              beeLine.getErrorStream(),
              eventNotifier
          ));
    }
    // 这里是真正执行的地方 stmnt 是 上面的HiveStatement
    hasResults = stmnt.execute(sql);
    ... ...
}
```
=> 如上，到了 HiveStatement.execute()，调用 `runAsyncOnServer(sql)` 真正执行远程调用
```java
private void runAsyncOnServer(String sql) throws SQLException {
    ... ...
    try {
      // client 是Thrift的模板编译出来的RPC client，就是执行 ThriftCLIService 的 executeStatement 方法, 改方法调用
      TExecuteStatementResp execResp = client.ExecuteStatement(execReq);
      ... ...
    }
}
```

#### 2. HiveServer2 启动及远程调用
=> HiveServer2 启动了两种线程：` CLIService` 和 `ThriftCLIService`     
=>`ThriftCLIService`启动时，会将`CLIService`的实例也传给它。这样，`ThriftCLIService`收到请求后，就可以委托给`CLIService`处理
=> `CLIService` 主要封装了处理命令的逻辑，一条命令发到`HiveServer2`后，`ThriftCLIService`会委托给`CLIService`来处理。不同的命令会调用不同的`CLIService`方法。
    比如执行Sql就是调用`CliService#executeStatement()`方法。
=> `CliService#executeStatement()` 会把任务委托给内部的 HiveSession 执行 `HiveSession#executeStatement`
    关于SessionHandle和OperationHandle
    在hive中，一个session表示一个会话。我们可以理解为一个beeline控制台就是一个session，在我们通过!conn命令连接到集群后，HiveServer2就会创建一个HiveSession，然后交给SessionManager管理，之后返回一个SessionHandle给客户端，这个SessionHandle就是此次session的唯一标识了。后面客户端发送命令的时候都需要带上这个SessionHandle，这样HiveServer2才可以辨认出是哪个session发来的请求。
    在一个session中发起一个请求，HiveServer2收到请求进行处理后，会返回一个OperationHandle来作为此次操作的唯一标识。后面客户端可以通过这个OperationHandle标识来获取此次操作的具体信息（发请求时带上这个OperationHandle信息），比如获取操作的执行状态、日志等信息。
    这也就是说，一个session其实可以发起多个操作，只要维护好返回的OperationHandle，我们可以并行查询这些操作的相关状态。在beeline的控制台中，我们发送完一个命令后，会阻塞在那里，给我们的感觉好像一个session只能同时处理一个命令。
    另外，在阻塞的过程中，beeline客户端其实也不断的再想HiveServer2发送请求获取日志并输出。
=> HiveSession 再委托 `SqlOperation#runInternal()` => 最终调用 `Driver#run()`
    该方法里包括执行 preHook，compile，执行postHook

=> 如何提交 mapreduce 任务呢？
https://blog.csdn.net/zyzzxycj/article/details/102861166