import java.sql.*;

public class Database {

    private Connection connection;
    private PreparedStatement prepStatement;
    private ResultSet resultSet;

    public boolean connect()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:ucanaccess://Database.accdb");
            return true;
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
            return false;
        }
    }
}
