package org.example.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Booking")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customer_id;
    private Integer vehicle_id;
    private LocalDateTime rental_start_date;
    private LocalDateTime rental_end_date;
    private String rental_status;
    private Integer total_cost;
    private String payment_status;
}
