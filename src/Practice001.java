import java.sql.*;

public class Practice001 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newbase30";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery("SELECT * FROM talebeler");
        // Task01-> talebeler table'daki record'ları listeleyen code create ediniz
        // String query="select * from talebeler";
        System.out.println("   ***   task01   ***   ");
        while(resultSet1.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet1.getInt(1),resultSet1.getString(2),
                    resultSet1.getString(3),resultSet1.getInt(4));
        }
        // Task02-> talebeler table'daki notları 90 dan yuksek olan record'ları listeleyen code create ediniz
        System.out.println("   ***   task02   ***   ");
        ResultSet resultSet2 = statement.executeQuery("SELECT * FROM talebeler where yazili_notu>90");
        while(resultSet2.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet2.getInt(1),resultSet2.getString(2),
                    resultSet2.getString(3),resultSet2.getInt(4));
        }
    }
}
