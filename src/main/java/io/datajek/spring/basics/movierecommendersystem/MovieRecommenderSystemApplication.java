package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;

@SpringBootApplication // @Configuration @EnableAutoConfiguration @ComponentScan
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		String favoriteMovie = recommender.getFavoriteMovie();
		System.out.println(favoriteMovie);
	}

}
