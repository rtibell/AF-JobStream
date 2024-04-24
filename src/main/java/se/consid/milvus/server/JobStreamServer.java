package se.consid.milvus.server;

import reactor.core.publisher.Mono;
import se.consid.milvus.dto.JobListing;

import java.util.List;
import java.util.Optional;

public interface JobStreamServer {
    public Mono<List<JobListing>> fetchNextInJobInStream();
}
