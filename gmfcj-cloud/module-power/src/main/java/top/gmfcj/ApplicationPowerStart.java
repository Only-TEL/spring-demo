package top.gmfcj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationPowerStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPowerStart.class);
    }
}
