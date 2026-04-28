import java.sql.*;

public class Login {
    public static void main(String[] args) throws Exception {
        String user = "admin";
        String password = "1234";

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement stmt = con.createStatement();

        String query = "SELECT * FROM users WHERE username = '" + user + "' AND password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);

        if(rs.next()) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
    }
}
