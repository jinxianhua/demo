package cn.kim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication(scanBasePackageClasses = KimApplication.class)
public class KimApplication {
    public static void main(String[] args) {
        SpringApplication.run(KimApplication.class, args);
    }
}
