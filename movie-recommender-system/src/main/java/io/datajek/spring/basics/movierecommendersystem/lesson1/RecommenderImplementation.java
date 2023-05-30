package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        String[] results = contentBasedFilter.getRecommendations(movie);
        return results;
    }
}
