package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Vehicle;
import org.example.Entity.VehicleEntity;
import org.example.Repositary.VehicleRepositary;
import org.example.Service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    final VehicleRepositary repositary;
    final ModelMapper mapper;

    @Override
    public List<Vehicle> getVehicle() {
        List<Vehicle> vehicleList = new ArrayList<>();
        repositary.findAll().forEach(vehicle -> vehicleList.add(mapper.map(vehicle,Vehicle.class)));
        return vehicleList;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        repositary.save(mapper.map(vehicle, VehicleEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repositary.deleteById(id);
    }

    @Override
    public List<Vehicle> searchByName(String name) {
        List<Vehicle> vehicles = new ArrayList<>();
        repositary.findByName(name).forEach(entity->{
            vehicles.add(mapper.map(entity,Vehicle.class));
        });

        return vehicles;
    }

    @Override
    public List<Vehicle> searchByBrand(String brand) {
        List<Vehicle> vehicles = new ArrayList<>();
        repositary.findByBrand(brand).forEach(entity -> vehicles.add(mapper.map(entity, Vehicle.class)));
        return vehicles;
    }


}

