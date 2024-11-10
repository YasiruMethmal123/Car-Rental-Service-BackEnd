package org.example.Controller;

import org.example.Dto.Vehicle;
import org.example.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleService service;

    @GetMapping("/getVehicle")
    public List<Vehicle> getVehicle(){
        return service.getVehicle();
    }

    @PostMapping("/addVehicle")
    public void addVehicle(@RequestBody Vehicle vehicle){
        service.addVehicle(vehicle);
    }

    @DeleteMapping("/deleteVehicleById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/updateVehicle")
    @ResponseStatus(HttpStatus.OK )
    public void updateUser(@RequestBody Vehicle vehicle){
        service.addVehicle(vehicle);
    }

    @GetMapping("/SearchByName/{name}")
    public List<Vehicle> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }

    @GetMapping("/SearchBybrand/{brand}")
    public List<Vehicle> searchByBrand(@PathVariable String brand){
        return service.searchByBrand(brand);
    }



}
