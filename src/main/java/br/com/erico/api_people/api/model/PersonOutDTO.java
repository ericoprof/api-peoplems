package br.com.erico.api_people.api.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonOutDTO extends PersonBaseDTO{

    private String name;
    private LocalDate dataBirth;
}
