package com.sridhar.singletable.repository;

import com.sridhar.singletable.Avatar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("stAvatarRepository")
public interface AvatarRepository extends CrudRepository<Avatar, Long>{

}
