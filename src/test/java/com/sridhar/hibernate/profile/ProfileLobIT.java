package com.sridhar.hibernate.profile;

import com.sridhar.Application;
import org.apache.commons.io.FileUtils;
import org.hibernate.engine.jdbc.ClobProxy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ProfileLobIT {

    private static final int COUNT = 1000;
    @Autowired
    ProfileWithLobLocatorRepository profileWithLobLocatorRepository;

    @Autowired
    ProfileWithMaterializedLobRepository profileWithMaterializedLobRepository;

    @Autowired
    ResourceLoader resourceLoader;

    @Test
    public void loadData() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:comments.txt");
        String comments = FileUtils.readFileToString(resource.getFile());

        for(int i=0; i<COUNT; i++) {
            Long randomId = ThreadLocalRandom.current().nextLong(100, 1000);
            ProfileWithMaterializedLob profileWithMaterializedLob = new ProfileWithMaterializedLob(randomId, UUID.randomUUID().toString(), comments);
            profileWithMaterializedLobRepository.save(profileWithMaterializedLob);

            ProfileWithLobLocator profileWithLobLocator = new ProfileWithLobLocator(randomId, UUID.randomUUID().toString());
            profileWithLobLocator.setCommentsClob(ClobProxy.generateProxy(comments));
            profileWithLobLocatorRepository.save(profileWithLobLocator);
        }
    }

    @Test
    public void fetchData() throws IOException {
        ProfileWithMaterializedLob profileWithMaterializedLob = profileWithMaterializedLobRepository.findOne(379l);
        Assert.assertNotNull(profileWithMaterializedLob.getCommentsLobStr());
        Assert.assertNotNull(profileWithMaterializedLob.getComments());

        ProfileWithLobLocator profileWithLobLocator = profileWithLobLocatorRepository.findOne(379l);
    }
}
