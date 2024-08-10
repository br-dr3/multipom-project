package com.github.brdr3.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
@RequiredArgsConstructor
public class MyService {

    private final ServiceProperties serviceProperties;

    public String message() {
        return this.serviceProperties.getMessage();
    }
}
