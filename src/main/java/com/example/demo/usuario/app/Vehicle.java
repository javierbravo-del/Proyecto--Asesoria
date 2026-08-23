package com.example.demo.usuario.app;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "vehicle")

public class Vehicle {

    @UniqueElements
    private String plate;
    private String year;
    @NotBlank(message = "La marca es obligatoria")
    private String brand;
    private String model;
    private String color;
}
