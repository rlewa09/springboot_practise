package io.datajek.spring.basics.movierecommendersystem.lesson4;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{};
    }
}
