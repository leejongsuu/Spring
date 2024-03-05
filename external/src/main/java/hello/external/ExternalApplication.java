package hello.external;

import hello.external.config.MyDataSourceEnvConfig;
import hello.external.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

//@Import({MyDataSourceEnvConfig.class})
//@Import({MyDataSourceValueConfig.class})
@SpringBootApplication(scanBasePackages = "hello.external.datasource")
@ConfigurationPropertiesScan
public class ExternalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApplication.class, args);
	}

}
