package cn.merryyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
	/**
	 * 重新访问可能会出现以下提示错误，稍等一会刷新就OK啦
	 EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(ComputeServiceApplication.class, args);
	}
}
