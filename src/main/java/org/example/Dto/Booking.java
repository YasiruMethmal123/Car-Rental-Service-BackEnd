package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    private Integer id;
    private Integer customer_id;//connected to customer entity
    private Integer vehicle_id;//connected to vehicle entity
    private Date rental_start_date;
    private Date rental_end_date;
    private String rental_status;
    private Integer total_cost;
    private String payment_status;
}
