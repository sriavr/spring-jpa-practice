package com.sridhar.temple.repository;

import com.sridhar.temple.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("personRepository")
public interface PersonRepository extends CrudRepository<Person, Long> {

}
