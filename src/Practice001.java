import java.sql.*;

public class Practice001 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newbase30";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery("SELECT * FROM talebeler");
        System.out.println("   ***   task01   ***   ");
        while(resultSet1.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet1.getInt(1),resultSet1.getString(2),
                    resultSet1.getString(3),resultSet1.getInt(4));
        }

        System.out.println("   ***   task02   ***   ");
        ResultSet resultSet2 = statement.executeQuery("SELECT * FROM talebeler where yazili_notu");
        while(resultSet2.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet2.getInt(1),resultSet2.getString(2),
                    resultSet2.getString(3),resultSet2.getInt(4));
        }
    }
}
