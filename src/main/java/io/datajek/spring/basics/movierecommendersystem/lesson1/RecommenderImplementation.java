package io.datajek.spring.basics.movierecommendersystem.lesson1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

  // Filter is a dependency of RecommenderImplementation.

  private Filter filter; // name based autowired

  public Filter getFilter() {
    return filter;
  }

  // set > constructor
  // @Autowired
  // @Qualifier("CF")
  public void setFilter(Filter filter) {
    // logger.info("+++++In RecommenderImplementation setter method..dependency
    // injection");
    this.filter = filter;
  }

  // @Autowired
  public RecommenderImplementation(@Qualifier("CF") Filter filter) {
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
    String[] results = this.filter.getRecommendations("Finding Dory");
    return results;
  }
}
