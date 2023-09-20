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
        // Task01-> talebeler table'daki record'ları listeleyen code create ediniz
        // String query="select * from talebeler";
        while(resultSet1.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet1.getInt(1),resultSet1.getString(2),
                    resultSet1.getString(3),resultSet1.getInt(4));
        }

        System.out.println("   ***   task02   ***   ");
        // Task02-> talebeler table'daki notları 90 dan yuksek olan record'ları listeleyen code create ediniz
        ResultSet resultSet2 = statement.executeQuery("SELECT * FROM talebeler where yazili_notu>90");
        while(resultSet2.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet2.getInt(1),resultSet2.getString(2),
                    resultSet2.getString(3),resultSet2.getInt(4));
        }

        System.out.println("   ***   task03   ***   ");
        // Task03-> talebeler table'daki id değeri 124 olan record'ları listeleyen code create ediniz

        ResultSet resultSet3 = statement.executeQuery("SELECT * FROM talebeler where id=124");
        while(resultSet3.next()){
            System.out.printf("%-6d   %-20.20s  %-8s %-6d\n",resultSet3.getInt(1),resultSet3.getString(2),
                    resultSet3.getString(3),resultSet3.getInt(4));
        }
    }
}
