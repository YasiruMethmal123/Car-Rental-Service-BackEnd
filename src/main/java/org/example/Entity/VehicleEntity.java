package org.example.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Vehicle")
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //private Blob car_image;
    private String name;
    private String brand;
    private Integer passenger_capacity;
    private Integer boot_capacity;
    private Integer manufacture_year;
    private Integer Price;
    private Integer Available;
}