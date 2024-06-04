package br.com.erico.api_people.api.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInputDTO {

    private static final int SIZE_MIN_NAME_STREET = 4;
    private static final int SIZE_MAX_NAME_STREET = 255;
    private static final int SIZE_MIN_NAME_CITY = 3;
    private static final int SIZE_MAX_NAME_CITY = 60;
    private static final int SIZE_MAX_ZIPCODE = 60;
    private static final int SIZE_MAX_NUMBER = 60;

    @Valid
    @NotNull
    private PersonBaseDTO person;

    @NotBlank
    @Size(min = SIZE_MIN_NAME_STREET, max = SIZE_MAX_NAME_STREET)
    private String street;

    @NotBlank
    @Size(max = SIZE_MAX_ZIPCODE)
    private String zipCode;

    @NotBlank
    @Size(max = SIZE_MAX_NUMBER)
    private String number;

    @NotBlank
    @Size(min = SIZE_MIN_NAME_CITY, max = SIZE_MAX_NAME_CITY)
    private String city;

    @NotNull
    @AssertTrue
    private Boolean isPrimary;
}
