package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private String password_confirmation;

}
