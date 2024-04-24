package se.consid.milvus.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
import org.springframework.web.client.RestTemplate;
import se.consid.milvus.server.JobStreamServer;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Service
@Slf4j
public class JobStreamServerImpl implements JobStreamServer {
    private static final String JOB_STREAM_HOST_URI = "https://jobstream.api.jobtechdev.se";
//    @Autowired
//    private WebClient jobStreamWebClient;
    private final RestTemplate jobStreamRestTemplate;

    @Autowired
    public JobStreamServerImpl(RestTemplate jobStreamRestTemplate) {
        this.jobStreamRestTemplate = jobStreamRestTemplate;
    }


    @Override
    public Optional<String> fetchNextInJobInStream() {
        String url = JOB_STREAM_HOST_URI + "/stream?date=" + "2024-04-24T12:25:51";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        //headers.add("Accept", "application/json");
        //headers.add("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 14.4; rv:125.0) Gecko/20100101 Firefox/125.0");
        headers.add("Connection", "keep-alive");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        log.info("Fetching job from URL: {}", url);
        ResponseEntity<String> response = jobStreamRestTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class
        );

        log.info("Result: {}", response.getStatusCode(), response.getBody());
        Optional<String> optional = Optional.ofNullable(response.getBody());
        return optional;
//        return jobStreamWebClient.get()
//                .uri(uriBuilder -> uriBuilder
//                        .path("")
//                        //.path("/stream")
//                       // .queryParam("date", "2024-04-23T12%3A59%3A27")
//                        .build())
//                .accept(MediaType.APPLICATION_JSON)
//                //.attribute("date", "2024-04-22T12%3A59%3A27")
//                .retrieve()
//                .bodyToMono(String.class)
//                .onErrorMap(original -> {
//                    log.error("Error occurred during web client call: ",
//                            original.getCause(),
//                            original.getMessage(),
//                            original.getLocalizedMessage());
//                    return new Exception("Error during WebClient call", original);
//                });
    }
}
