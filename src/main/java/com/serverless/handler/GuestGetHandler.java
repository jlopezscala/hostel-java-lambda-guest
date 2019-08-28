package com.serverless.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.serverless.function.GuestPostConsumer;
import com.serverless.model.Guest;
import com.serverless.util.GuestMapper;

import java.io.IOException;

public class GuestGetHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        APIGatewayProxyResponseEvent apiGatewayProxyResponseEvent = new APIGatewayProxyResponseEvent();
        if (process(input)) {
            apiGatewayProxyResponseEvent.setStatusCode(200);
        } else {
            apiGatewayProxyResponseEvent.setStatusCode(404);
            apiGatewayProxyResponseEvent.setBody("Guest add failure");
        }
        return apiGatewayProxyResponseEvent;
    }

    private boolean process(APIGatewayProxyRequestEvent input) {
        GuestPostConsumer guestPostConsumer = new GuestPostConsumer();
        try {
            Guest guest = GuestMapper.getMapper().readValue(input.getBody(), Guest.class);
            guestPostConsumer.accept(guest);

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
