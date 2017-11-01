package com.sridhar.hibernate.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProfileWithLobLocatorRepository extends JpaRepository<ProfileWithLobLocator, Long> {
}
