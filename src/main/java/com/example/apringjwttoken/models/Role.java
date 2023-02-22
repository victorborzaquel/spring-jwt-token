package com.example.apringjwttoken.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role1 {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
}
