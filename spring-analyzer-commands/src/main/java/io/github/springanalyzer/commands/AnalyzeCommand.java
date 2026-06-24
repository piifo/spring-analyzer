package io.github.springanalyzer.commands;

import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Component
@Command(
    name = "spring-analyzer",
    description = "Analyzes Spring Boot microservice architectures and generates reports",
    mixinStandardHelpOptions = true,
    version = "0.1.0"
)
public class AnalyzeCommand implements Runnable {

  @Option(names = {"-c", "--config"}, description = "Path to repos.yml config file", required = true)
  private String configPath;

  @Option(names = {"-o", "--output"}, description = "Output file path (default: report.html)", defaultValue = "report.html")
  private String outputPath;

  @Override
  public void run() {
    // TODO: orchestrate analysis
    System.out.println("Analyzing with config: " + configPath);
    System.out.println("Output: " + outputPath);
  }

}