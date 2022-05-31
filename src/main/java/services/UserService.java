package services;

import models.Users;
import java.util.List;

public interface UserService
{
    Users getUser(int id);

    List<Users> getAllUsers();

    Users regUser(Users u);

    Users updateWins(Users u);

    Users updateLosses(Users u);

    Users deleteUser(int id);
}
