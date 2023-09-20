import java.sql.*;

public class Practice001 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newbase30";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM talebeler");
        while(resultSet.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),resultSet.getInt(4));
        }
    }
}
