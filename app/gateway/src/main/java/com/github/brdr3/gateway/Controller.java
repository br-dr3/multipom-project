package com.github.brdr3.gateway;

import com.github.brdr3.core.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final MyService myService;

    @GetMapping("/")
    public String home() {
        return myService.message();
    }
}
