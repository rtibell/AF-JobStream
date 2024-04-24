package se.consid.milvus.server;

//import reactor.core.publisher.Mono;

import java.util.Optional;

public interface JobStreamServer {
    public Optional<String> fetchNextInJobInStream();
}
