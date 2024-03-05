package hello.external.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class PayConfig {

    @Bean
    public LocalPayClient localPayClient() {
        log.info("LocalPayClient 빈 등록");
        return new LocalPayClient();
    }

    @Bean
    public ProdPayClient prodPayClient() {
        log.info("ProdPayClient 빈 등록");
        return new ProdPayClient();
    }
}
