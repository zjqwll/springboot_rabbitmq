#springboot_rabbitmq demo

#使用阅读:
1、代码完整仔细，有注释；
2、欢迎大家优化代码，新增注释；
3、目前topic模式接受不到消息，没找到原因；
4、可回调

#测试地址和打印消息:
地址1:localhost:8080/rabbitmq/contract/topic
消息1：Received contract<{"id":12,"name":"liuhan","testStrList":["liu","test str"],"dateCreated":"Sep 17, 2016 10:31:36 PM"}>

地址2:localhost:8080/rabbitmq/contract/direct
消息2：Received contract<{"id":12,"name":"liuhan","testStrList":["liu","test str"],"dateCreated":"Sep 17, 2016 10:31:37 PM"}>

地址3:localhost:8080/rabbitmq/tenant/direct
消息3：Received Bar<{"id":12,"name":"liuhan"}>

地址4:localhost:8080/rabbitmq/tenant/topic
消息4：Received Bar<{"id":12,"name":"liuhan"}>
