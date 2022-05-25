package repositories;

import models.Users;
import java.util.List;

public interface UserRepo
{
    public Users getUser(int id);

    public List<Users> getAllUsers();

    public Users regUser(Users u);
}
