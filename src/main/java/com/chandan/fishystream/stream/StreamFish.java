package com.chandan.fishystream.stream;

import com.chandan.Fish;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.rabbitmq.RMQSource;
import org.apache.flink.streaming.connectors.rabbitmq.common.RMQConnectionConfig;

public class StreamFish {

/*Flink programs look like regular programs that transform collections of data. Each program consists of the same basic parts:

    Obtain an execution environment,
    Load/create the initial data,
    Specify transformations on this data,
    Specify where to put the results of your computations,
    Trigger the program execution

*/

  public static void main(String args[]){

    final RMQConnectionConfig connectionConfig = new RMQConnectionConfig.Builder().setHost("localhost").setPort(5000).build();

    // this decides the right way to start flink, if its run from the ide then start a local flink instance if its run from a jar it starts a cluster
    // this is better than spark where you have to manually specify
    StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

    DataStream<Fish> fishDataStream = env.addSource(new RMQSource<Fish>(connectionConfig,"Fishy",
        false, new Fish())).setParallelism(1);




    fishDataStream.addSink(new InfluxDBSink<>())

  }
}
