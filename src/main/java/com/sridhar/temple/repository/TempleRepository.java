package com.sridhar.temple.repository;

import com.sridhar.temple.entity.Temple;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("templeRepository")
public interface TempleRepository extends CrudRepository<Temple, Long>{

}
