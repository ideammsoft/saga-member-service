package com.ch.sagamemberservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
@Slf4j
@ActiveProfiles
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SagaMemberServiceApplicationTests {
    @LocalServerPort
    int port;
    //웹상의 요청을 시도하는 객체 (Rest API 호출 시 많이 사용)
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Test
    void contextLoads() {
        String url="http://localhost:"+port+"/api/members?providerName=google";
        String body = testRestTemplate.getForObject(url, String.class);

        log.debug("테스트 상태에서 호출한 결과는 {}", body);
    }

}
