package org.example.Service;

import org.example.Dto.Vehicle;
import java.util.List;

public interface VehicleService {
    List<Vehicle> getVehicle();
    void addVehicle(Vehicle vehicle);
    void deleteById(Integer id);
    List<Vehicle> searchByName(String name);
    List<Vehicle> searchByBrand(String brand);

}
