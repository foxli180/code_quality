package com.jumpingstone.codequality.fireeye.service.impl;

import com.jumpingstone.codequality.fireeye.service.SimilarityResponse;
import com.jumpingstone.codequality.fireeye.service.SimilarityService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service("similarityService")
public class SimilarityServiceImpl implements SimilarityService {

    @Override
    public Mono<SimilarityResponse> findSimilarityFiles(String project_id, Float threshold) {
        SimilarityResponse response = new SimilarityResponse();
        return Mono.just(response);
    }

    @Override
    public Mono<SimilarityResponse> findSimilarityFiles(String project_id, Integer file_id, Float threshold) {
        SimilarityResponse response = new SimilarityResponse();
        return Mono.just(response);
    }


}
