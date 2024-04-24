package se.consid.milvus.config;

//import io.netty.channel.ChannelOption;
//import io.netty.handler.timeout.ReadTimeoutHandler;
//import io.netty.handler.timeout.WriteTimeoutHandler;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.client.reactive.ReactorClientHttpConnector;
//import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//import reactor.netty.http.client.HttpClient;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//@Configuration
//@Slf4j
public class WebClientConfig {

//
//    @Bean
//    public WebClient.Builder jobStreamWebClientReactBuilder() {
//        return WebClient.builder()
//                //.baseUrl("https://jobstream.api.jobtechdev.se")
//                .baseUrl("https://www.dn.se") // Set a default base URL
//                .clientConnector(new ReactorClientHttpConnector(createHttpClient()))
//                .defaultHeader("Content-Type", "application/json")
//                .defaultHeader("Accept", "application/json")
//                .defaultHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 14.4; rv:125.0) Gecko/20100101 Firefox/125.0")
//                .defaultHeader("Host", "jobstream.api.jobtechdev.se")
//                .defaultHeader("Connection", "keep-alive")
//                .filter(logRequest()); // Adding a logging filter
//    }
//
//
//
//    // Optional: You can define a default WebClient instance if needed in multiple places
//    @Bean
//    public WebClient jobStreamWebClientReact(WebClient.Builder builder) {
//        return builder.build(); // Build the WebClient instance with the above configuration
//    }
//
//    private HttpClient createHttpClient() {
//        return HttpClient.create()
//                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 15000) // Connection Timeout
//                .responseTimeout(Duration.ofSeconds(15)) // Response Timeout
//                .doOnConnected(conn ->
//                        conn.addHandlerLast(new ReadTimeoutHandler(30000, TimeUnit.MILLISECONDS)) // Read Timeout
//                                .addHandlerLast(new WriteTimeoutHandler(30000, TimeUnit.MILLISECONDS)) // Write Timeout
//                );
//    }
//
//    // Utility method to create a logging filter
//    private ExchangeFilterFunction logRequest() {
//        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
//            log.info("Request: {} {}", clientRequest.method(), clientRequest.url());
//            clientRequest.headers().forEach((name, values) -> values.forEach(value -> log.debug("{}: {}", name, value)));
//            return Mono.just(clientRequest);
//        });
//    }
}
