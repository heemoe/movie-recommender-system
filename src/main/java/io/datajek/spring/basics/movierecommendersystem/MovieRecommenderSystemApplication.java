package io.datajek.spring.basics.movierecommendersystem;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.datajek.spring.basics.movierecommendersystem.lesson1.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson1.Movie;
import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;

@SpringBootApplication // @Configuration @EnableAutoConfiguration @ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
		CollaborativeFilter cf1 = applicationContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = applicationContext.getBean(CollaborativeFilter.class);

		System.out.println("---cf1---");
		System.out.println(cf1);
		System.out.println("---cf2---");
		System.out.println(cf2);

		ContentBasedFilter cbf = applicationContext.getBean(ContentBasedFilter.class);
		Movie movie1 = cbf.getMovie();
		Movie movie2 = cbf.getMovie();
		Movie movie3 = cbf.getMovie();
		System.out.println("---movie1-----");
		System.out.println(movie1);
		System.out.println("---movie2-----");
		System.out.println(movie2);
		System.out.println("---movie3-----");
		System.out.println(movie3);

		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(RecommenderImplementation.class);
		System.out.println(Arrays.toString(result));
	}

}
