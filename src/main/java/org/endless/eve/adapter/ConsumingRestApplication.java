package main.java.org.endless.eve.adapter;

import ch.qos.logback.classic.Logger;
import main.java.org.endless.eve.entity.Market;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ConsumingRestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws NullPointerException{
        return args -> {
            Market market = restTemplate.getForObject(
                    "https://www.ceve-market.org/api/quicklook", Market.class);
            System.out.println(market.toString());
        };
    }
}
