package com.serverless.function;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.serverless.model.Guest;

import java.util.function.Consumer;

public class GuestPostConsumer implements Consumer<Guest> {

    @Override
    public void accept(Guest guest) {
        try {
            AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
            DynamoDBMapper mapper = new DynamoDBMapper(client);
            mapper.save(guest);
        } catch (Exception ex) {
            System.out.println("Error trying to save guest in DynamoDB");
        }
    }
}
