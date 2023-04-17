package com.example.CrawlerTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrawlerToolApplication {

	public static void main(String[] args) {
		CrawlTool crawlTool = new CrawlTool();
		crawlTool.tool(2);
		SpringApplication.run(CrawlerToolApplication.class, args);
	}

}
