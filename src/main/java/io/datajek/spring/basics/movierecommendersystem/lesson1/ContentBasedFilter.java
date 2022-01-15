package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter {

  private static int instances;

  @Autowired
  public Movie movie;

  public ContentBasedFilter() {
    super();
    instances++;
    System.out.println("ContentBasedFilter constructor called");
  }

  @Lookup // same as beanFactory.getBean(Movie.class).
  public Movie getMovie() {
    return movie;
  }

  public int getInstances() {
    return ContentBasedFilter.instances;
  }

  public String[] getRecommendations(String movie) {

    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }
}
