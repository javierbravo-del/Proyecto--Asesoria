package com.example.demo.usuario.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "vehicle")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String plate;
    @NotBlank
    private Integer year;
    @NotNull(message = "La marca es obligatoria")
    private String brand;
    @NotBlank
    private String model;
    @NotBlank
    private String color;
}
