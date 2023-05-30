package io.datajek.spring.basics.movierecommendersystem.lesson16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("CBF")
@Service
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

}
