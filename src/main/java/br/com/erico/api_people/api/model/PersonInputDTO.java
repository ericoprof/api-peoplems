package br.com.erico.api_people.api.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInputDTO {

    private static final int SIZE_MIN_NAME = 4;
    private static final int SIZE_MAX_NAME = 60;

    @NotBlank
    @Size(min = SIZE_MIN_NAME, max = SIZE_MAX_NAME)
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateBirth;

    @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
    public String getDataBirthFormatted(){
        return dateBirth != null ? dateBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : null;
    }
}
