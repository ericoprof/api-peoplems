package br.com.erico.api_people.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.erico.api_people.api.model.AddressInputDTO;
import br.com.erico.api_people.api.model.AddressOutDTO;
import br.com.erico.api_people.assembler.AddressAssembler;
import br.com.erico.api_people.domain.service.AddressService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private AddressAssembler addressAssembler;
    private AddressService addressService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public AddressOutDTO getMethodName(@RequestBody final @Valid AddressInputDTO addressInputDTO) {
        return addressAssembler.toDto(addressService.register(addressAssembler.toAddress(addressInputDTO)));
    }

    @GetMapping("/list")
    public List<AddressOutDTO> list() {
        return addressAssembler.toCollectionDto(addressService.list());
    }

    @GetMapping("/{personId}")
    public List<AddressOutDTO> getMethodName(@PathVariable final @NotNull Long personId) {
        return addressAssembler.toCollectionDto(addressService.mainAddress(personId));
    }

    @DeleteMapping("/{addressId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable final Long addressId) {
        addressService.removerAddress(addressId);
    }

}