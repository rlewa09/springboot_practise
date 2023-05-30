package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
