package com.ican.saf.safConfigServer;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableEncryptableProperties
@SpringBootApplication
public class SafConfigServerApplication {

    public static void main(String[] args) {
        var app = new SpringApplication(SafConfigServerApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }

}
