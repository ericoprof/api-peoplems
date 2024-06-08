package br.com.erico.api_people.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erico.api_people.domain.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByPersonIdAndIsPrimary(Long personId, Boolean isPrimary);
}
