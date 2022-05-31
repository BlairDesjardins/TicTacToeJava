package repositories;

import models.Users;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class UserRepoTest
{
    static UserRepo ur = new UserRepoImpl();
    static Users user;
    static Users createdUser;

    public UserRepoTest() {}

    @Before
    public void setUp() {
        Users u = new Users(1, "bob", "password", 0, 0, "jpg");
        user = ur.regUser(u);
    }

    @After
    public void teardown() {
        if (user != null) {
            ur.deleteUser(user.getU_id());
            user = null;
        }
        if (createdUser != null) {
            ur.deleteUser(createdUser.getU_id());
            createdUser = null;
        }
    }

    @Test
    public void getUser()
    {
        Users actual = ur.getUser(user.getU_id());
        Users expected = new Users(user.getU_id(), "bob", "password", 0, 0, "jpg");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void createUser() {
        Users expected = new Users(1, "doug", "password", 0, 0, "jpg");
        createdUser = ur.regUser(expected);
        expected.setU_id(createdUser.getU_id());
        Assertions.assertEquals(expected, createdUser);
    }

    @Test
    public void updateWins() {
        int wins = 5;
        user.setWins(wins);
        Users actual = ur.updateWins(user);
        Assertions.assertEquals(actual.getWins(), wins);
    }

    @Test
    public void updateLosses() {
        int losses = 5;
        user.setLosses(losses);
        Users actual = ur.updateLosses(user);
        Assertions.assertEquals(actual.getLosses(), losses);
    }

    @Test
    public void deleteUser() {
        Users actual = ur.deleteUser(user.getU_id());
        Assertions.assertEquals(user, actual);
    }
}
