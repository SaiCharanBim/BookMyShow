package com.example.BookMyShow.dto.request;

import com.example.BookMyShow.enums.UserType;
import com.example.BookMyShow.models.Movie;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieOwnerSignUpDTO {
    String name;
    String email;
    long phoneNumber;
    String password;
    UserType type;
    int companyAge;
    List<Movie> movies;
}
