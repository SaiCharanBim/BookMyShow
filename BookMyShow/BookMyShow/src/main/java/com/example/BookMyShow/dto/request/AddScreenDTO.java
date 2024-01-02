package com.example.BookMyShow.dto.request;

import com.example.BookMyShow.models.Screen;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddScreenDTO {
    List<Screen> screens;
    UUID hallId;
}
