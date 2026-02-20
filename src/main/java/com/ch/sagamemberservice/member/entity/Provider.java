package com.ch.sagamemberservice.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="provider")
@NoArgsConstructor
@Getter
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="provider_id")
    private Integer providerId;

    @Column(name="provider_name")
    private String providerName;
}
