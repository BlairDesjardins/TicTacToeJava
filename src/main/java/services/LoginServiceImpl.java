package services;

import models.LoginPage;
import models.Users;
import repositories.LoginRepo;

import java.util.List;

public class LoginServiceImpl implements LoginService
{
    private LoginRepo lr;

    public LoginServiceImpl(LoginRepo lr)
    {
        this.lr = lr;
    }
    @Override
    public Users login(String username)
    {
        return lr.login(username);
    }
}
