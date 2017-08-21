package com.sridhar.temple;

import com.sridhar.temple.entity.Address;
import com.sridhar.temple.entity.Person;
import com.sridhar.temple.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("temple")
public class TempleTest {

    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Test
    public void basicTest(){

        Person person = new Person();
        person.setFullName("Parthasarathy");
        person.setEmailAddress("heart@vaishnavas.com");
        Address address = new Address();
        address.setCity("Goloka Vrindavan");
        address.setCountry("Vaikuntam");
        address.setState("Lakshmi Nivas");
        address.setStreet("hari nilayam");
        person.setPermanentAddress(address);
        personRepository.save(person);


    }


}
