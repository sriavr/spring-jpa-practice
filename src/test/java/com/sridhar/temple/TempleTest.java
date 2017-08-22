package com.sridhar.temple;

import com.sridhar.temple.entity.Address;
import com.sridhar.temple.entity.Person;
import com.sridhar.temple.entity.Temple;
import com.sridhar.temple.repository.PersonRepository;
import com.sridhar.temple.repository.TempleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("temple")
public class TempleTest {

    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private TempleRepository templeRepository;

    @Autowired
    public void setTempleRepository(TempleRepository templeRepository) {
        this.templeRepository = templeRepository;
    }

    @Commit
    @Test
    public void basicTest(){
        List<Person> donorsList = new ArrayList<>();

        Person person1 = new Person();
        person1.setFullName("Parthasarathy");
        person1.setEmailAddress("heart@vaishnavas.com");
        Address address1 = new Address();
        address1.setCity("Goloka Vrindavan");
        address1.setCountry("Vaikuntam");
        address1.setState("Lakshmi Nivas");
        address1.setStreet("hari nilayam");
        person1.setPermanentAddress(address1);
        donorsList.add(person1);

        Person person2 = new Person();
        person2.setFullName("Sri rama");
        person2.setEmailAddress("heart@srirama.com");
        Address address2 = new Address();
        address2.setCity("Ayodhya");
        address2.setCountry("Vaikuntam");
        address2.setState("Sitha Pathy");
        address2.setStreet("hari nilayam");
        person2.setPermanentAddress(address2);
        donorsList.add(person2);

        Temple temple = new Temple();
        temple.setTempleName("Sri Jagannath Mandir");
        temple.setDonorsList(donorsList);
        templeRepository.save(temple);

    }


}
