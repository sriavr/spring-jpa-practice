package com.sridhar.tableperclass.repository;

import com.sridhar.tableperclass.Avatar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("tcAvatarRepository")
public interface AvatarRepository extends CrudRepository<Avatar, Long>{

}
