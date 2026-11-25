package com.seer;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ReleaseSoapController {
    private static final String NAMESPACE = "http://release.seer.com";

    @PayloadRoot(namespace = NAMESPACE, localPart = "")
}