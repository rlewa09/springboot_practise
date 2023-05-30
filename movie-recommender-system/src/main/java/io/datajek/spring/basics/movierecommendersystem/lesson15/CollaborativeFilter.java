package io.datajek.spring.basics.movierecommendersystem.lesson15;

import io.datajek.spring.basics.movierecommendersystem.lesson15.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{};
    }
}
