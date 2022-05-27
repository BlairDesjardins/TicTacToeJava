package repositories;
import models.LoginPage;
import models.Users;

import java.util.List;

public interface LoginRepo
{
    public Users login(String username);
}
