package com.sridhar.hibernate.profile;

import com.sridhar.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ProfileRepositoryIT {

    @Autowired
    ProfileRepository profileRepository;

    @Test
    public void testSaveProfile(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profileRepository.save(profile);
    }

}
