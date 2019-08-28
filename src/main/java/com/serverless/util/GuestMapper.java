package com.serverless.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GuestMapper {

    private static ObjectMapper mapper;

    public static ObjectMapper getMapper() {
        if (mapper == null) {
            mapper = new ObjectMapper();
        }
        return mapper;
    }
}


