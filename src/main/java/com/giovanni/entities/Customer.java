package com.giovanni.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clientes")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false)
    private String name;

    @Column(name = "APELLIDO", nullable = false)
    private String lastName;

    @Column(name = "EMAIL",nullable = false)
    private String email;
}

