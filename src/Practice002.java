import java.sql.*;

public class Practice002 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newbase30";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM personel");
    }
}
