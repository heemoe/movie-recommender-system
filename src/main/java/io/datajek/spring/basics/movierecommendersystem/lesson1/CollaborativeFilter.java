package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.stereotype.Service;

@Service
public class CollaborativeFilter implements Filter {

  public CollaborativeFilter() {
    super();
  }

  public String[] getRecommendations(String movie) {

    // logic of collaborative filter
    return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
  }

}
