package com.ppmp.uniware.configuration;

import com.ppmp.uniware.UniwareClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author ankurpratik on 21/11/18.
 */
@Configuration
public class PpmpClientConfig {

    @Bean
    public UniwareClient getUniwareClient() {
        return new UniwareClient(new JerseyClientBuilder().build(), "");
    }


}
