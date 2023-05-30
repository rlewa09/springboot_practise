package io.datajek.spring.basics.movierecommendersystem.lesson11;

import io.datajek.spring.basics.movierecommendersystem.lesson11.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method.. dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
