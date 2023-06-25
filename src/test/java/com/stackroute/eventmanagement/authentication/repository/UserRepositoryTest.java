package com.stackroute.eventmanagement.authentication.repository;

//import com.stackroute.com.AuthenticationService.model.UserModel;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@ExtendWith(SpringExtension.class)
//@DataJpaTest
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepo;
//
//    @Test
//    public void testFindByEmailId() {
//        // Given
//        String emailId = "test@example.com";
//        UserModel user = new UserModel();
//        user.setEmailId(emailId);
//        user.setName("John Doe");
//        user.setPassword("password");
//        userRepo.save(user);
//
//        // When
//        UserModel foundUser = userRepo.findByEmailId(emailId);
//
//        // Then
//        assertNotNull(foundUser);
//        assertEquals(emailId, foundUser.getEmailId());
//    }
//
//    @Test
//    public void testFindByEmailIdAndPassword() {
//        // Given
//        String emailId = "test@example.com";
//        String password = "password";
//        UserModel user = new UserModel();
//        user.setEmailId(emailId);
//        user.setName("John Doe");
//        user.setPassword(password);
//        userRepo.save(user);
//
//        // When
//        UserModel foundUser = userRepo.findByEmailIdAndPassword(emailId, password);
//
//        // Then
//        assertNotNull(foundUser);
//        assertEquals(emailId, foundUser.getEmailId());
//        assertEquals(password, foundUser.getPassword());
//    }
//}
//
