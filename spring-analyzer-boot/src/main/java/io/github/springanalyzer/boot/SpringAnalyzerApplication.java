package io.github.springanalyzer.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.springanalyzer")
public class SpringAnalyzerApplication {

  public static void main(String[] args) {
    System.exit(SpringApplication.exit(SpringApplication.run(SpringAnalyzerApplication.class, args)));
  }

}