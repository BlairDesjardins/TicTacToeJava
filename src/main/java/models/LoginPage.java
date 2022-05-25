package models;

public class LoginPage
{
    private String username;
    private String password;

    public LoginPage(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public LoginPage() {

    }

    public void login_details(String username)
    {
        this.username = username;
        this.password = password;
    }
}


