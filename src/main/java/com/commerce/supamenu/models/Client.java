package com.commerce.supamenu.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "representative")
    private String representative;

    @Column(name = "bank_accnt")
    private String bankAccount;

    @OneToMany
    private Set<Restaurant> restaurants;
}
