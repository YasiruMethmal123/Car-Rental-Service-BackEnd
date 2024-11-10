package org.example.Repositary;

import org.example.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicleRepositary extends JpaRepository<VehicleEntity,Integer> {
    List<VehicleEntity> findByName(String name);
    List<VehicleEntity> findByBrand(String brand);

}
