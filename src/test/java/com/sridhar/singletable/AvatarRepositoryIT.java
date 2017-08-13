package com.sridhar.singletable;

import com.sridhar.Application;
import com.sridhar.common.Yoni;
import com.sridhar.common.Yuga;
import com.sridhar.singletable.repository.AvatarRepository;
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
        purushaAvatar = new PurushaAvatar("Karanodakashayi Vishnu", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(purushaAvatar);

        purushaAvatar = new PurushaAvatar("Garbhodakashayi Vishnu", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(purushaAvatar);

        purushaAvatar = new PurushaAvatar("Kshirodakashayi Vishnu", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(purushaAvatar);

        GunaAvatar gunaAvatar;
        gunaAvatar = new GunaAvatar("Brahma", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(gunaAvatar);

        gunaAvatar = new GunaAvatar("Vishnu", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(gunaAvatar);

        gunaAvatar = new GunaAvatar("Maheshwara", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(gunaAvatar);

        LilaAvatar lilaAvatar;
        lilaAvatar = new LilaAvatar("Kumaras", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Narada", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Varaha", Yuga.SATHYA, Yoni.PASHU);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Matsya", Yuga.SATHYA, Yoni.PASHU);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Yajna", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Nara-Narayana", Yuga.SATHYA, Yoni.RISHI);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kardami", Yuga.SATHYA, Yoni.RISHI);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dattatreya", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Hayasirsa", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Hamsa", Yuga.SATHYA, Yoni.PASHU);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dhruvapriya or Prsniggarbha", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Rsabha", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Prthu", Yuga.SATHYA, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Nrsmha", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kurma", Yuga.SATHYA, Yoni.PASHU);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Dhanvantari", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Mohini", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Vamana", Yuga.SATHYA, Yoni.DEVA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Bhargava Parasurama", Yuga.SATHYA, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Ramachandra", Yuga.SATHYA, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Vyasa", Yuga.DWAPARA, Yoni.RISHI);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Prlambhari Balarama", Yuga.SATHYA, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Krishna", Yuga.DWAPARA, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Buddha", Yuga.KALI, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);
        lilaAvatar = new LilaAvatar("Kalki", Yuga.KALI, Yoni.MANUSHYA);
        avatarRepository.save(lilaAvatar);

    }
}
