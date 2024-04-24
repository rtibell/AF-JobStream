package se.consid.milvus.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.util.Timeout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;


@Configuration
@Slf4j
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        // Configure the HttpClient to use with the RestTemplate
        RequestConfig config = RequestConfig.custom()
                .setConnectionRequestTimeout(Timeout.of(Duration.ofSeconds(15)))
                .setConnectionKeepAlive(Timeout.of(Duration.ofSeconds(60)))
                .build();

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(config)
                .build();

        // Use the HttpComponentsClientHttpRequestFactory to integrate Apache HttpClient with RestTemplate
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);

        RestTemplate template = new RestTemplate(clientHttpRequestFactory);
        return template;
    }
}
