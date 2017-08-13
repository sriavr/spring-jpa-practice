package com.sridhar.tableperclass;

import com.sridhar.Application;

import com.sridhar.tableperclass.repository.AvatarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AvatarRepositoryIT {

    @Autowired
    private AvatarRepository avatarRepository;

    @Test
    public void testInsertAvatar(){
        PurushaAvatar purushaAvatar;
        purushaAvatar = new PurushaAvatar("Karanodakashayi Vishnu");
        avatarRepository.save(purushaAvatar);

        purushaAvatar = new PurushaAvatar("Garbhodakashayi Vishnu");
        avatarRepository.save(purushaAvatar);

        purushaAvatar = new PurushaAvatar("Kshirodakashayi Vishnu");
        avatarRepository.save(purushaAvatar);

        GunaAvatar gunaAvatar;
        gunaAvatar = new GunaAvatar("Brahma");
        avatarRepository.save(gunaAvatar);

        gunaAvatar = new GunaAvatar("Vishnu");
        avatarRepository.save(gunaAvatar);

        gunaAvatar = new GunaAvatar("Maheshwara");
        avatarRepository.save(gunaAvatar);

        LilaAvatar lilaAvatar;
        lilaAvatar = new LilaAvatar("Kumaras");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Narada");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Varaha");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Matsya");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Yajna");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Nara-Narayana");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kardami");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dattatreya");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Hayasirsa");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Hamsa");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dhruvapriya or Prsniggarbha");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Rsabha");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Prthu");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Nrsmha");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kurma");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dhanvantari");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Mohini");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Vamana");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Bhargava Parasurama");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Ramachandra");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Vyasa");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Prlambhari Balarama");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Krishna");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Buddha");
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kalki");
        avatarRepository.save(lilaAvatar);

    }
}
