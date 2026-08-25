package com.example.demo.usuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.usuario.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/")
    public void getVehicle() {
        System.out.println("obteniendo vehiculos");
        vehicleService.getVehicle();
    }

}
