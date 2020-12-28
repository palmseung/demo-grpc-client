package com.example.demogrpcclient;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@SpringBootApplication
public class DemoGrpcClientApplication {

  private final GrpcClient grpcClient;

  public static void main(String[] args) {
    SpringApplication.run(DemoGrpcClientApplication.class, args);
  }

  @GetMapping("/")
  public Mono<String> test() {
    return Mono.just(grpcClient.sampleCall());
  }
}
