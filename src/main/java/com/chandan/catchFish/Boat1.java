// author : chandan
package com.chandan.catchFish;

import com.chandan.Fish;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import org.apache.commons.lang.SerializationUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.stream.IntStream;

/*
publish msg to queue
with simulates a boat load of fish
salmon
tuna
cod
plastic bag
leftshoe
*/
public class Boat1 {

  public static String QUEUE_NAME = "Fishy";

  public static void main(String args[]) throws IOException, TimeoutException {

    //create rabbitmq connection
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();

    Fish f = Fish.addFish(10,4,5);


    channel.queueDeclare(QUEUE_NAME, false, false, false, null);

    try {
      IntStream.range(1, 5).forEach(
          count ->
          {
            //Fish.addFish(.random());
            try {
              channel.basicPublish("", QUEUE_NAME, null, SerializationUtils.serialize(f));
            } catch (IOException e) {
              e.printStackTrace();
            }

            System.out.println(" [x] Sent '" + f.toString() + "'");
          }
      );
    }catch (Exception e){
      System.out.println(e);
    }



  }
}
