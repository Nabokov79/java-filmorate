package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.filmorate.validators.After;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    private long id;
    @NotEmpty
    @NotNull
    private String name;
    @NotNull
    @Size(min = 1, max = 200)
    private String description;
    @After("1895-12-28")
    @NotNull
    private LocalDate releaseDate;
    @Positive
    @NotNull
    private int duration;


    public long addNewIdFilm() {
        return id += 1;
    }
}