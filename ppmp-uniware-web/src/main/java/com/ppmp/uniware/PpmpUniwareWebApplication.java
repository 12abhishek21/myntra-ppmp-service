package com.ppmp.uniware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//exclude = {SecurityAutoConfiguration.class } added to annotation to disable username password both.
public class PpmpUniwareWebApplication {

    private static Logger LOG = LoggerFactory.getLogger(PpmpUniwareWebApplication.class);

    public static void main(String[] args) {
        LOG.info("Initialising ...");
        SpringApplication.run(PpmpUniwareWebApplication.class, args);
        LOG.info("Initialisation Complete !!! ");
    }

    @Bean
    DispatcherServlet dispatcherServlet() {
        DispatcherServlet ds = new DispatcherServlet();
        ds.setThrowExceptionIfNoHandlerFound(true);
        return ds;
    }
}
