Kafka commanda :
=======================

    Start Zookeeper : -- .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties   (default port:2181)
    Strat Kafka : -- C:\Users\mallelar\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties   (default port:9091)

        first create topic :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-topics.bat --create -bootstrap-server localhost:9092 --topic test

        than start Kafka producer :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-console-producer.bat --broker-list localhost:9092 --topic test

        and start Kafka consumer :
            C:\Users\mallelar\kafka\bin\windows> .\kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning
            