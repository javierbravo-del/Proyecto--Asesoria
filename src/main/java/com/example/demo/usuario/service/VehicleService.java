package com.example.demo.usuario.service;

import org.springframework.stereotype.Service;

import com.example.demo.usuario.repository.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    void createVehicle(String plate, String year, String brand, String model, String color) {
        System.out.println("Creando vehiculo: " + brand + "" + model);

    }

    public void getVehicle() {
        System.out.println("Obteniendo vehiculos");
        vehicleRepository.findAll();
    }

}
