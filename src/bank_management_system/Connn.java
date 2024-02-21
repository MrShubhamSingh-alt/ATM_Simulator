package bank_management_system;
import java.sql.*;
public class Connn
{
    Connection connection ;
    Statement statement ;

    public Connn()
{

    try
    {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Shubham@1998");
        statement = connection.createStatement();

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}

}
