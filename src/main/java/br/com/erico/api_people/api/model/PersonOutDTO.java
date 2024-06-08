package br.com.erico.api_people.api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonOutDTO extends PersonBaseDTO{

    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateBirth;
}
