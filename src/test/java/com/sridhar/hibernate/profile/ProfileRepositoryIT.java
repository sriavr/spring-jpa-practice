package com.sridhar.hibernate.profile;

import com.sridhar.Application;
import com.sridhar.temple.entity.Address;
import com.sridhar.temple.entity.Person;
import com.sridhar.temple.repository.PersonRepository;
import org.apache.commons.io.FileUtils;
import org.hibernate.engine.jdbc.ClobProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ProfileRepositoryIT {
    Logger logger = LoggerFactory.getLogger(ProfileRepositoryIT.class);

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ResourceLoader resourceLoader;

    @Test
    public void testSaveProfile(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
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
    public void testSaveProfileWithTags(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profile.setTagList(Arrays.asList(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        profileRepository.save(profile);
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


    @Test
    public void testSaveProfileWithAddresses(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profile.setTagList(Arrays.asList(UUID.randomUUID().toString(), UUID.randomUUID().toString()));

        List<Address> addressList = new ArrayList<>();
        Address address1 = new Address();
        address1.setCity("Goloka Vrindavan");
        address1.setCountry("Vaikuntam");
        address1.setState("Lakshmi Nivas");
        address1.setStreet("hari nilayam");
        addressList.add(address1);

        Address address2 = new Address();
        address2.setCity("Ayodhya");
        address2.setCountry("Vaikuntam");
        address2.setState("Sitha Pathy");
        address2.setStreet("hari nilayam");
        addressList.add(address2);

        profileRepository.save(profile);
    }

    @Test
    public void testSaveProfileWithPersons(){
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        Person person1 = new Person();
        person1.setFullName("Parthasarathy");
        person1.setEmailAddress("heart@vaishnavas.com");
        Address address1 = new Address();
        address1.setCity("Goloka Vrindavan");
        address1.setCountry("Vaikuntam");
        address1.setState("Lakshmi Nivas");
        address1.setStreet("hari nilayam");
        person1.setPermanentAddress(address1);
        personRepository.save(person1);
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        profile.setPersonList(personSet);
        profileRepository.save(profile);

    }

    @Test
    public void testFindAllProfilesWithPersons(){
        Iterable<Profile> profileIterable = profileRepository.findAll();
        for (Profile profile : profileIterable) {
            for(String tag: profile.getTagList()) {
                logger.info(tag);
            }
        }
    }

    @Test
    public void testSaveWithCommentsClob() throws IOException {
        Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
        Profile profile = new Profile(randomId, UUID.randomUUID().toString(), true, false);
        profile.setTagList(Arrays.asList(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        Resource resource = resourceLoader.getResource("classpath:comments.txt");
        String comments = FileUtils.readFileToString(resource.getFile());
        profile.setComments(ClobProxy.generateProxy(comments));
        profileRepository.save(profile);
    }

    @Test
    public void testFindWithCommentsClob() throws SQLException, IOException {
        List<Profile> list = profileRepository.findAll();
        for(Profile profile: list){
            if(profile.getComments()!=null){
                Reader reader = profile.getComments().getCharacterStream();
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line ;
                while((line =bufferedReader.readLine())!=null){
                    logger.info(line);
                }
            }
            logger.info("profile.getComments() = " + profile.getComments());
        }
    }

}
