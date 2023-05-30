package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        super();
        logger.info("In Movie constructor method");
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("In Movie preDestroy method");
    }
}
