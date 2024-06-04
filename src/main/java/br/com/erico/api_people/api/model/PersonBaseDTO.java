package br.com.erico.api_people.api.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonBaseDTO {

    @NotNull
    private Long id;
}
