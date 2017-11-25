package yejin.shortenURL.test;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * SpringBootApplication class.
 * 
 * @author yeeeah_j
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableConfigurationProperties
public class ShortenUrlApplication {
	private static final Logger LOG = Logger.getLogger(ShortenUrlApplication.class.getSimpleName());

	/**
	 * Methods to run spring application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.debug("main");

		SpringApplication.run(ShortenUrlApplication.class, args);
	}
}