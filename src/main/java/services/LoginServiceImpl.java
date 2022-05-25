package services;

import models.LoginPage;
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
    public LoginPage login(int id)
    {
        return lr.login(id);
    }
}
