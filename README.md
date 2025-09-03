Kafka commanda :
=======================

    Start Zookeeper : --  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties   (default port:2181)
    Strat Kafka : -- C:\Users\mallelar\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties   (default port:9091)

        first create topic :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-topics.bat --create -bootstrap-server localhost:9092 --topic test

        than start Kafka producer :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-console-producer.bat --broker-list localhost:9092 --topic test

        and start Kafka consumer :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning

        show list of topics :
            C:\Users\mallelar\kafka\bin\windows> .\bin\windows\kafka-topics.bat --list --bootstrap-server=localhost:9092


            https://www.geeksforgeeks.org/advance-java/microservices-communication-with-apache-kafka-in-spring-boot/
            https://www.bing.com/videos/riverview/relatedvideo?q=springboot+microservies+with+kafka&&mid=FE3252F7A9CDD99F6C81FE3252F7A9CDD99F6C81&FORM=VAMGZC
            
            