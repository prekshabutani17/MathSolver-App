package com.amazonaws.mobile.api;

//
//  CloudLogicAPIFactory.java
//
//
// Copyright 2017 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.19
//

/**
 * Produces instances of Cloud Logic API configuration.
 */
public class CloudLogicAPIFactory {

    private CloudLogicAPIFactory() {}

    /**
     * Gets the configured micro-service instances.
     * @return
     */
    public static CloudLogicAPIConfiguration[] getAPIs() {
        final CloudLogicAPIConfiguration[] apis = new CloudLogicAPIConfiguration[] {
                new CloudLogicAPIConfiguration("routes",
                                              "used to perform transactions on the ROUTES table",
                                              "https://lifo3u9d63.execute-api.us-east-2.amazonaws.com/Development",
                                              new String[] {
                                                  "/createRoute",
                                                  "/createRoute/123",
                                                  "/getRoute",
                                                  "/getRoute/123",
                                                  "/useRoute",
                                                  "/useRoute/123",
                                              },
                                              com.amazonaws.mobile.api.idlifo3u9d63.RoutesMobileHubClient.class),
                new CloudLogicAPIConfiguration("biker",
                                              "",
                                              "https://n11j96w8ll.execute-api.us-east-2.amazonaws.com/Development",
                                              new String[] {
                                                  "/createUser",
                                                  "/createUser/123",
                                                  "/verifyUser",
                                                  "/verifyUser/123",
                                              },
                                              com.amazonaws.mobile.api.idn11j96w8ll.BikerMobileHubClient.class),
        };

        return apis;
    }
}