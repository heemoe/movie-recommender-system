package io.datajek.spring.basics.movierecommendersystem;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;

@SpringBootApplication // @Configuration @EnableAutoConfiguration @ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(RecommenderImplementation.class);
		System.out.println(Arrays.toString(result));
	}

}
