package com.serverless.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.serverless.ApiGatewayResponse;
import org.apache.log4j.Logger;

public class GuestGetHandler implements RequestHandler<APIGatewayProxyRequestEvent, ApiGatewayResponse> {


	@Override
	public ApiGatewayResponse handleRequest(APIGatewayProxyRequestEvent input, Context context) {
		//LOG.info("received: " + input.);
		//Response responseBody = new Response("Go Serverless v1.x! Your function executed successfully!", input);
		return /*ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(responseBody)
				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
				.build()*/null;
	}
}
