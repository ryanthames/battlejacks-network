package com.battlejacks.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * It seems silly to have a spring application backing what is essentially just a page with static content, but this
 * will provide flexibility later if we ever decide to do some more complicated things.
 */
@SpringBootApplication
public class SiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}
}
