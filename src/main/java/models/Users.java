package models;

import java.util.Objects;

public class Users
{
    private int u_id;
    private String username;
    private String password;
    private int wins;
    private int losses;
    private String profile_pic;

    public Users()
    {

    }

    public Users(int u_id, String username, String password, int wins, int losses, String profile_pic)
    {
        this.u_id = u_id;
        this.username = username;
        this.password = password;
        this.wins = wins;
        this.losses = losses;
        this.profile_pic = profile_pic;
    }

    public int getU_id()
    {
        return u_id;
    }
    public void setU_id(int id)
    {
        this.u_id = id;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
       this.username = username;
    }

    public  String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getWins()
    {
        return wins;
    }
    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public int getLosses()
    {
        return losses;
    }
    public void setLosses(int losses)
    {
        this.losses = losses;
    }

    public String getProfile_pic()
    {
        return profile_pic;
    }
    public void setProfile_pic(String profile_pic)
    {
        this.profile_pic = profile_pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return u_id == users.u_id && wins == users.wins && losses == users.losses && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(profile_pic, users.profile_pic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(u_id, username, password, wins, losses, profile_pic);
    }
}
