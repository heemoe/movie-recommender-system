package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter {

  public String[] getRecommendations(String movie) {

    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }
}
