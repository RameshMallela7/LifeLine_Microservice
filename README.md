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



Topics need to implement :
==============================

    Records
    Sealed
    Patter Matching
    Pagination and filtering
    Database Access :
        Lazy loading -fetch type
        Transctions
        Custom queries
        flyway or liquibase
        Redis for caching DB data for enhancing
        TestContainers for DB testing
    Testing :
        MockMVC, WebTestCLient, Integration Testing
        TestContainers for DB testing
        Mockito
    API client- EXternal API call
        RestTemplete -- legacy
        WebClient -- Reactive
    Centralized logs - ELK
    Reactive Programming             
            