package mx.unnamed.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ScfZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfZuulProxyApplication.class, args);
	}

}
