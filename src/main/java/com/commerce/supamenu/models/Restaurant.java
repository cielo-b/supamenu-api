package com.commerce.supamenu.models;

import com.commerce.supamenu.enums.ERestaurantCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "restaurant")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private ERestaurantCategory category;

    @Column(name = "address")
    private String address;

    @Column(name = "resto_name")
    private String restoName;

    @Column(name = "resto_full_name")
    private String restoFullName;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @OneToMany
    private List<Photo> photos;

    @ManyToOne
    private Client client;
}
