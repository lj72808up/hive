Apache Hive (TM)
================
[![Master Build Status](https://travis-ci.org/apache/hive.svg?branch=master)](https://travis-ci.org/apache/hive/branches)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.hive/hive/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.apache.hive%22)

The Apache Hive (TM) data warehouse software facilitates reading,
writing, and managing large datasets residing in distributed storage
using SQL. Built on top of Apache Hadoop (TM), it provides:

* Tools to enable easy access to data via SQL, thus enabling data
  warehousing tasks such as extract/transform/load (ETL), reporting,
  and data analysis

* A mechanism to impose structure on a variety of data formats

* Access to files stored either directly in Apache HDFS (TM) or in other
  data storage systems such as Apache HBase (TM)

* Query execution using Apache Hadoop MapReduce, Apache Tez
  or Apache Spark frameworks.

Hive provides standard SQL functionality, including many of the later
2003 and 2011 features for analytics.  These include OLAP functions,
subqueries, common table expressions, and more.  Hive's SQL can also be
extended with user code via user defined functions (UDFs), user defined
aggregates (UDAFs), and user defined table functions (UDTFs).

Hive users have a choice of 3 runtimes when executing SQL queries.
Users can choose between Apache Hadoop MapReduce, Apache Tez or
Apache Spark frameworks as their execution backend. MapReduce is a
mature framework that is proven at large scales. However, MapReduce
is a purely batch framework, and queries using it may experience
higher latencies (tens of seconds), even over small datasets. Apache
Tez is designed for interactive query, and has substantially reduced
overheads versus MapReduce. Apache Spark is a cluster computing
framework that's built outside of MapReduce, but on top of HDFS,
with a notion of composable and transformable distributed collection
of items called Resilient Distributed Dataset (RDD) which allows
processing and analysis without traditional intermediate stages that
MapReduce introduces.

Users are free to switch back and forth between these frameworks
at any time. In each case, Hive is best suited for use cases
where the amount of data processed is large enough to require a
distributed system.

Hive is not designed for online transaction processing. It is best used
for traditional data warehousing tasks.  Hive is designed to maximize
scalability (scale out with more machines added dynamically to the Hadoop
cluster), performance, extensibility, fault-tolerance, and
loose-coupling with its input formats.


General Info
============

For the latest information about Hive, please visit out website at:

  http://hive.apache.org/


Getting Started
===============

- Installation Instructions and a quick tutorial:
  https://cwiki.apache.org/confluence/display/Hive/GettingStarted

- A longer tutorial that covers more features of HiveQL:
  https://cwiki.apache.org/confluence/display/Hive/Tutorial

- The HiveQL Language Manual:
  https://cwiki.apache.org/confluence/display/Hive/LanguageManual


Requirements
============

- Java 1.7 or 1.8

- Hadoop 2.x


Upgrading from older versions of Hive
=====================================

- Hive includes changes to the MetaStore schema. If
  you are upgrading from an earlier version of Hive it is imperative
  that you upgrade the MetaStore schema by running the appropriate
  schema upgrade scripts located in the scripts/metastore/upgrade
  directory.

- We have provided upgrade scripts for MySQL, PostgreSQL, Oracle,
  Microsoft SQL Server, and Derby databases. If you are using a
  different database for your MetaStore you will need to provide
  your own upgrade script.

Useful mailing lists
====================

1. user@hive.apache.org - To discuss and ask usage questions. Send an
   empty email to user-subscribe@hive.apache.org in order to subscribe
   to this mailing list.

2. dev@hive.apache.org - For discussions about code, design and features.
   Send an empty email to dev-subscribe@hive.apache.org in order to
   subscribe to this mailing list.

3. commits@hive.apache.org - In order to monitor commits to the source
   repository. Send an empty email to commits-subscribe@hive.apache.org
   in order to subscribe to this mailing list.




jps 里 runjar 显示的 hive 3个组件
=========
```bash
[root@10 ~]# jps
10336 RunJar
10325 RunJar
352376 RunJar

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