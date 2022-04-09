package com.example.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("Nilesh", "Manager")));
      log.info("Preloading " + repository.save(new Employee("Mike", "Lead")));
      log.info("Preloading " + repository.save(new Employee("Emp1", "Dev")));
      log.info("Preloading " + repository.save(new Employee("Emp2", "test")));
    };
  }
}