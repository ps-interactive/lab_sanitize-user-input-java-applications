import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class JavaJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/users", "root", "NEW_PASSWORD"
            );
            Statement statement = connection.createStatement();
            Scanner myObj = new Scanner(System.in);
            //System.out.println("Enter password");
            //String password_attempt = myObj.nextLine();

            // Query which needs parameters
            String query = "Select * from employees where password = ?";

            // Prepare Statement
            PreparedStatement myStmt = connection.prepareStatement(query);

            // Set Parameters
            myStmt.setString(1, "Squidward");

            // Execute SQL query
            ResultSet myRs = myStmt.executeQuery();

            // Display function to show the Resultset
            while (myRs.next()) {
            String Name = myRs.getString("first_name");
            int user_id = myRs.getInt("user_id");
            System.out.println(Name + "     " + user_id);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
