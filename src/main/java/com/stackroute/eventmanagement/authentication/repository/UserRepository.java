package com.stackroute.eventmanagement.authentication.repository;

import com.stackroute.eventmanagement.authentication.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    UserModel findByEmailId(String emailId);

    UserModel findByEmailIdAndPassword(String emailId, String password);
}
