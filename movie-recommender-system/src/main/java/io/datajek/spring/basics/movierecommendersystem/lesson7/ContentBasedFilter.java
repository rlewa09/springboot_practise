package io.datajek.spring.basics.movierecommendersystem.lesson7;

import io.datajek.spring.basics.movierecommendersystem.lesson7.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("CBF")
@Component
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
