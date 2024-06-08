package br.com.erico.api_people.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erico.api_people.domain.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
