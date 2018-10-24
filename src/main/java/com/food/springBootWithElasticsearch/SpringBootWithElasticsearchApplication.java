package com.food.springBootWithElasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//in the application class exclude the datasource bean loading
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = { "com.food.springBootWithElasticsearch" })
@EnableElasticsearchRepositories(basePackages = { "com.food.springBootWithElasticsearch.repository" })
@EnableJpaRepositories(basePackages = { "com.food.springBootWithPostgresql.repository" })

@SpringBootApplication
public class SpringBootWithElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithElasticsearchApplication.class, args);
	}
}
