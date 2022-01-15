package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

  // Filter is a dependency of RecommenderImplementation.

  private Filter filter; // name based autowired

  @Autowired
  public RecommenderImplementation(@Qualifier("CF") Filter filter) {
    this.filter = filter;
  }

  // set > constructor
  @Autowired
  @Qualifier("CF")
  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  // filter is automated inject (create a instance dynamic)
  public String[] recommendMovies(String movie) {
    System.out.println("Name of the filter in use: " + filter + "\n");
    String[] results = this.filter.getRecommendations("Finding Dory");
    return results;
  }
}
