package org.cloud.contact.business.transfer;

import org.cloud.contact.business.transfer.services.filter.AllFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@SpringBootApplication
//@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
public class ContactApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ContactApp.class);
        logger.debug("start app");
//        ConfigurableApplicationContext appConfig = SpringApplication.run(ContactApp.class, args);
        SpringApplication app = new SpringApplication(ContactApp.class);
        app.run(args);
        app.setBannerMode(Banner.Mode.OFF);
        Logger logger2 = LoggerFactory.getLogger("SqlLog");
        logger2.debug("start sql");
    }

    @Bean
    public TokenStore tokenStore() {
        //使用内存的tokenStore
        return new InMemoryTokenStore();
    }
    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new AllFilter());
        registration.addUrlPatterns("/*"); //
        registration.addInitParameter("paramName", "paramValue"); //
        registration.setName("testFilter");
        return registration;
    }
}
