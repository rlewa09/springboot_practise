package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		System.out.println("\n Beans loaded");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

//		RecommenderImplementation recommender = appContext.getBean("recommenderImplementation", RecommenderImplementation.class);
		RecommenderImplementation recommender = appContext.getBean("recommenderImpl", RecommenderImplementation.class);
		//use ApplicationContext to find which filter is being used
//		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//call method to get recommendations
//		String[] result = recommender.recommendMovies("Finding Dory");
//
//		//display results
//		System.out.println(Arrays.toString(result));

		//print dependency
		System.out.println("\nDependency: " + recommender.getFilter());
		System.out.println();

		appContext.close();

	}
}