package com.example.demo.usuario.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.usuario.app.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Vehicle save(Vehicle vehicle);

    List<Vehicle> findAll();

    Vehicle findByPlate(String plate);
}
