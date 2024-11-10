package org.example.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;
    private Integer rental_id;//connected to booking entity
    private Integer amount;
    private String payment_date;
    private String payment_method;
    private String payment_status;

}
