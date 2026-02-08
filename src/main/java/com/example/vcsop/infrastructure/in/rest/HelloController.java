package com.example.vcsop.infrastructure.in.rest;

import com.example.vcsop.shared.rest.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hello", description = "Hello World API")
@RestController
@RequestMapping("/api")
public class HelloController {

    @Operation(summary = "Hello World", description = "VCSOP Java Template Hello World API")
    @GetMapping("/hello")
    public BaseResponse<String> hello() {
        return BaseResponse.success("Hello, VCSOP!");
    }
}
