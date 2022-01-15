package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("CF")
public class CollaborativeFilter implements Filter {

  public String[] getRecommendations(String movie) {
    // logic of collaborative filter
    return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
  }

}
