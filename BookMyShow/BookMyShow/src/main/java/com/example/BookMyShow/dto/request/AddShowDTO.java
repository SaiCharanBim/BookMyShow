package com.example.BookMyShow.dto.request;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddShowDTO {
    // 24 HOURS ;
    int hour;
    int minutes;
    int ticketPrice;
    UUID movieId;
    UUID hallId;
}
