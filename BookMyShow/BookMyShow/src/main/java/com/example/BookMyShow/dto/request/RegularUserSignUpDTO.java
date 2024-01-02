package com.example.BookMyShow.dto.request;

import com.example.BookMyShow.enums.UserType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegularUserSignUpDTO {
    String name;
    String email;
    long phoneNumber;
    String password;
    UserType type; // movieOwners, HallOwners and RegularUserServce
    int age;
}
