package com.oracle.cloud.accs.sample.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Stateless
@Path("")
public class TestResource {

    @GET
    public String hello() {
        System.out.println("GET invoked");

        String appName = System.getenv().getOrDefault("ORA_APP_NAME", "");
        String appPubURL = System.getenv().getOrDefault("ORA_APP_PUBLIC_URL", "");
        String appInstance = System.getenv().getOrDefault("ORA_INSTANCE_NAME", "");
        String appPort = System.getenv().getOrDefault("ORA_PORT", "");

        String response = "[App]" + appName + " [Instance]" + appInstance + " [URL]" + appPubURL
                + " [(internal) Port]" + appPort;
        System.out.println("response -- " + response);
        return response;
    }

}
