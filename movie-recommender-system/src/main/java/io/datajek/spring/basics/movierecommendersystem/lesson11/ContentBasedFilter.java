package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("CBF")
@Component
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public ContentBasedFilter() {
        super();
        System.out.println("content-based filter constructor called");
    }

    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("in ContentBasedFilter preDestroy method");
    }
}
