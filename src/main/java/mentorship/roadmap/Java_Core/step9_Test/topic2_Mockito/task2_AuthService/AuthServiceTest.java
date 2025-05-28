package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        /*
        userRepository = mock(UserRepository.class);
        authService = new AuthService(userRepository);
         */
    }

    @Test
    void authenticateUserSuccess() {
        User user = new User("user1", "password1");
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser("user1", "password1");
        assertTrue(result);

        verify(userRepository).findUserByUsername(user.getUsername());
    }

    @Test
    void authenticateUserFailurePasswordIsWrong() {
        User user = new User("user2", "password2");
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser("user2", "wrongpassword");
        assertFalse(result);

        verify(userRepository).findUserByUsername(user.getUsername());
    }

    @Test
    void authenticateUserFailureUserNotFound() {
        User user = new User("user3", "password3");
        when(userRepository.findUserByUsername("notfound")).thenReturn(null);

        boolean result = authService.authenticateUser("notfound", "password3");
        assertFalse(result);

        verify(userRepository).findUserByUsername("notfound");
    }
}
