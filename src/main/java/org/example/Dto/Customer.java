package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private String  addresscode;
    private String lane;
    private String city;
    private String province;
    private String NIC;
    private String telnumber;
    private String email;
    private Integer drivinglicenceNumber;
    private String dateofbirth;

}
