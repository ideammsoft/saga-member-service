package com.ch.sagamemberservice.member.service;

import com.ch.sagamemberservice.member.entity.Provider;
import com.ch.sagamemberservice.member.repository.ProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final ProviderRepository providerRepository;

    //sns 사업자 반환
    public Provider getProvider(String providerName){
        return providerRepository.findByProviderName(providerName).orElseThrow( () -> new IllegalArgumentException("해당 사업자가 존재하지 않습니다."));
    }

}