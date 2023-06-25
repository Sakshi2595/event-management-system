package com.stackroute.eventmanagement.authentication.service;

//import com.stackroute.com.AuthenticationService.exception.UserAlreadyExistsException;
//import com.stackroute.com.AuthenticationService.model.UserModel;
//import com.stackroute.com.AuthenticationService.repository.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class UserServiceImplTest {
//
//    @Mock
//    private UserRepository userRepository;
//
//    @Mock
//    private PasswordEncoder passwordEncoder;
//
//    @InjectMocks
//    private UserServiceImpl userService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//
//    @Test
//    void register_WhenUserExists_ShouldThrowUserAlreadyExistsException() {
//        // Arrange
//        UserModel user = new UserModel();
//        user.setEmailId("test@example.com");
//        user.setPassword("password");
//
//        when(userRepository.findByEmailId(user.getEmailId())).thenReturn(user);
//
//        // Act & Assert
//        assertThrows(UserAlreadyExistsException.class, () -> userService.register(user));
//        verify(userRepository, times(1)).findByEmailId(user.getEmailId());
//        verifyNoMoreInteractions(userRepository);
//        verifyNoInteractions(passwordEncoder);
//    }
//
//
//    @Test
//    void getAllUser_ShouldReturnAllUsers() {
//        // Arrange
//        List<UserModel> userList = new ArrayList<>();
//        userList.add(new UserModel("user1@example.com", "password1"));
//        userList.add(new UserModel("user2@example.com", "password2"));
//
//        when(userRepository.findAll()).thenReturn(userList);
//
//        // Act
//        List<UserModel> allUsers = userService.getAllUser();
//
//        // Assert
//        assertNotNull(allUsers);
//        assertEquals(2, allUsers.size());
//        assertEquals(userList, allUsers);
//        verify(userRepository, times(1)).findAll();
//    }
//}
