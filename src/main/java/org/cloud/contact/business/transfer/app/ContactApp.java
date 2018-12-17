package org.cloud.contact.business.transfer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@SpringBootApplication
@Configuration
@AutoConfigurationPackage
public class ContactApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ContactApp.class);
        logger.debug("start app");

        SpringApplication.run(ContactApp.class, args);
        Logger logger2 = LoggerFactory.getLogger("SqlLog");
        logger2.debug("start app");
    }
    @Bean
    public TokenStore tokenStore() {
        //使用内存的tokenStore
        return new InMemoryTokenStore();
    }
}
