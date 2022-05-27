package repositories;
import models.LoginPage;
import models.Users;
import util.JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginRepoImpl implements LoginRepo
{
    public static Connection conn = JDBCConnection.getConnection();

    @Override
    public Users login(String username)
    {
        String sql = "Select * from users where username = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return logindetails(rs);
            }
        }
        catch (SQLException e)
        {
           e.printStackTrace();
        }
        return null;
    }

    private Users logindetails(ResultSet rs) throws SQLException
    {
        Users user = new Users();
        user.setU_id(rs.getInt("u_id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setWins(rs.getInt("wins"));
        user.setLosses(rs.getInt("losses"));
        user.setProfile_pic(rs.getString("profile_pic"));
        return user;
    }
}
