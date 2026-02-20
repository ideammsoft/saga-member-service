package com.ch.sagamemberservice.member.repository;

import com.ch.sagamemberservice.member.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// class 대신 interface를 사용해야 하며, extends를 유지합니다.
public interface ProviderRepository extends JpaRepository<Provider, Integer> {

    // 프로바이더 하나 추출
    // select * from provider where provider_name = ?
    Optional<Provider> findByProviderName(String providerName);
}