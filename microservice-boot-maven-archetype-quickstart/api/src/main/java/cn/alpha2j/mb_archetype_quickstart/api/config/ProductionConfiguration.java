package cn.alpha2j.mb_archetype_quickstart.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@Configuration
@Profile("prod")
public class ProductionConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
