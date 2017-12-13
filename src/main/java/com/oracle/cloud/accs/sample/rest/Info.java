package com.oracle.cloud.accs.sample.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {

    private String appName;
    private String appPublicURL;
    private String appInstance;
    private String appPort;

    public Info() {

        appName = System.getenv().getOrDefault("ORA_APP_NAME", "javaee-hello-world");
        appPublicURL = System.getenv().getOrDefault("ORA_APP_PUBLIC_URL", "http://localhost:8080");
        appInstance = System.getenv().getOrDefault("ORA_INSTANCE_NAME", "instance-1");
        appPort = System.getenv().getOrDefault("ORA_PORT", "8080");
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPubURL() {
        return appPublicURL;
    }

    public void setAppPubURL(String appPubURL) {
        this.appPublicURL = appPubURL;
    }

    public String getAppInstance() {
        return appInstance;
    }

    public void setAppInstance(String appInstance) {
        this.appInstance = appInstance;
    }

    public String getAppPort() {
        return appPort;
    }

    public void setAppPort(String appPort) {
        this.appPort = appPort;
    }

    @Override
    public String toString() {
        return "Info{" + "appName=" + appName + ", appPubURL=" + appPublicURL + ", appInstance=" + appInstance + ", appPort=" + appPort + '}';
    }

}
