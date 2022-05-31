package services;

import models.LoginPage;
import models.Users;

public interface LoginService
{
    public Users login(String username);
}
