package com.sridhar.hibernate.profile;

import com.sridhar.Application;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ProfileRepositoryIT {
    Logger logger = LoggerFactory.getLogger(ProfileRepositoryIT.class);

    @Autowired
    ProfileRepository profileRepository;

    @Test
    public void testSaveProfile(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profileRepository.save(profile);
    }

    @Test
    public void testSaveProfileWithTags(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profile.setTagList(Arrays.asList(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        profileRepository.save(profile);
    }

    @Test
    public void testFindAllProfiles(){
        Iterable<Profile> profileIterable = profileRepository.findAll();
        for (Profile profile : profileIterable) {
            logger.info(profile.toString());
        }
    }

    @Test
    public void testFindAllProfilesWithTags(){
        Iterable<Profile> profileIterable = profileRepository.findAll();
        for (Profile profile : profileIterable) {
            for(String tag: profile.getTagList()) {
                logger.info(tag);
            }
        }
    }

}
