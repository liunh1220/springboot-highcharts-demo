package com.example.demo;

import com.example.demo.config.BaseConfiguration;
import com.example.demo.config.DruidConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfiguration.class,DruidConfig.class})
public class SpringbootChartsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChartsDemoApplication.class, args);
	}
}
