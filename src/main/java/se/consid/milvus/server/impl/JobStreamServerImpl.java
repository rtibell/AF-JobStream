package se.consid.milvus.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.web.client.RestTemplate;
import se.consid.milvus.dto.JobListing;
import se.consid.milvus.server.JobStreamServer;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class JobStreamServerImpl implements JobStreamServer {
    private static final String JOB_STREAM_HOST_URI = "https://jobstream.api.jobtechdev.se";
    @Autowired
    private WebClient jobStreamWebClient;


    @Override
    public Mono<List<JobListing>> fetchNextInJobInStream() {
        return jobStreamWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        //.path("")
                        .path("/stream")
                        .queryParam("date", "2024-04-24T16:59:27")
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                //.attribute("date", "2024-04-22T12%3A59%3A27")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<JobListing>>() {})
                .doOnError(e -> log.error("Error occurred during web client call message: {}, cause: {}, localized: {}",
                        e.getMessage(), e.getCause(), e.getLocalizedMessage()));

    }
}
