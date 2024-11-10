package org.example.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private Integer id;
    private String name;
    private String brand;
    private Integer passenger_capacity;
    private Integer boot_capacity;
    private Integer manufacture_year;
    private Integer Price;
    private Integer Available;
}
