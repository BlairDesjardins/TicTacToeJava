package services;

import models.Users;
import java.util.List;

public interface UserService
{
    public Users getUser(int id);

    public List<Users> getAllUsers();

    public Users regUser(Users u);
}
