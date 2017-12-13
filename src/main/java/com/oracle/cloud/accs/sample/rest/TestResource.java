package com.oracle.cloud.accs.sample.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Stateless
@Path("")
public class TestResource {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response hello() {
        System.out.println("GET invoked");

        return Response.ok(new Info()).build();
    }

//    @GET
//    public String hello() {
//        System.out.println("GET invoked");
//
//        String appName = System.getenv().getOrDefault("ORA_APP_NAME", "javaee-hello-world");
//        String appPubURL = System.getenv().getOrDefault("ORA_APP_PUBLIC_URL", "-NA-");
//        String appInstance = System.getenv().getOrDefault("ORA_INSTANCE_NAME", "-NA-");
//        String appPort = System.getenv().getOrDefault("ORA_PORT", "8080");
//
//        String response = "[App]" + appName + " [Instance]" + appInstance + " [URL]" + appPubURL
//                + " [(internal) Port]" + appPort;
//        System.out.println("response -- " + response);
//        return response;
//    }

}
