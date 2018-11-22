package com.ppmp.uniware;

import org.glassfish.jersey.client.JerseyClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ankurpratik on 21/11/18.
 */
@Configuration
public class PpmpConfiguration {

    @Bean
    public UniwareClient getUniwareClient() {
        return new UniwareClient(new JerseyClientBuilder().build(), "");
    }
}
