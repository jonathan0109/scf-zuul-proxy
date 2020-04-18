package mx.unnamed.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import mx.unnamed.scf.filters.CustomFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ScfZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfZuulProxyApplication.class, args);
	}

	@Bean
	public CustomFilter getFilter() {

		return new CustomFilter();
	}
}
