# kafka_producer_consumer_example

Kafka Producer and Consumer Example with Spring Boot

#start the zookeeper and broker with cmd:
#docker-compose up -d

#create a topic with cmd:
#docker-compose exec broker kafka-topics --create --topic example-topic --bootstrap-server broker:9092 --replication-factor 1 --partitions 1
