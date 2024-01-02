package com.example.BookMyShow.dto.request;

import com.example.BookMyShow.enums.UserType;
import com.example.BookMyShow.models.Hall;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HallOwnerSignUpDTO {
    String name;
    String email;
    long phoneNumber;
    String password;
    UserType type;
    List<Hall> halls;
    int companyAge;
}
