package com.sridhar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomerRepositoryTest {


    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testInsertCustomer(){
        customerRepository.save(new Customer("Jack", "Bauer"));
    }
}