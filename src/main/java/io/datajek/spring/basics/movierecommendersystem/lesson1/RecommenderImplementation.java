package io.datajek.spring.basics.movierecommendersystem.lesson1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {
  @Value("${recommender.implementation.favoriteMovie: default value}")
  String favoriteMovie;

  // Filter is a dependency of RecommenderImplementation.

  @Autowired
  @Qualifier("contentBasedFilter")
  private Filter filter; // name based autowired

  public Filter getFilter() {
    return filter;
  }

  public String getFavoriteMovie() {
    return favoriteMovie;
  }

  // set > constructor
  // @Autowired
  // @Qualifier("CF")
  public void setFilter(Filter filter) {
    // logger.info("+++++In RecommenderImplementation setter method..dependency
    // injection");
    this.filter = filter;
  }

  @PostConstruct
  public void postConstruct() {
    // logger.info("----- In RecommenderImplementation postConstruct method");
  }

  @PreDestroy
  public void preDestroy() {
    // cleanup code
    // logger.info("----- In RecommenderImplementation preDestroy method");
  }

  // filter is automated inject (create a instance dynamic)
  public String[] recommendMovies(String movie) {
    System.out.println("Name of the filter in use: " + filter + "\n");
    String[] results = this.filter.getRecommendations(getFavoriteMovie());
    return results;
  }
}
