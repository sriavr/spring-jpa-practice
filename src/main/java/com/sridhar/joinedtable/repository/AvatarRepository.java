package com.sridhar.joinedtable.repository;

import com.sridhar.joinedtable.Avatar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("jtAvatarRepository")
public interface AvatarRepository extends CrudRepository<Avatar, Long>{

}
