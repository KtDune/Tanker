package com.tanker.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tanker.entities.UserAccount;

@RepositoryRestResource
public interface UserInterfaces extends JpaRepository<UserAccount, Long> {}
