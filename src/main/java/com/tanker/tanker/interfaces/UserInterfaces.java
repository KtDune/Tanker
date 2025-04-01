package com.tanker.tanker.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.tanker.tanker.entities.UserAccount;

@RepositoryRestResource
public interface UserInterfaces extends JpaRepository<UserAccount, Long> {}
