import java.sql.*;  

public class conn {
    Connection c;
    Statement s;

    public conn() {  
        try {  
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");  

            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "USERNAME", "PASSWORD"); 
            
            // Create a statement
            s = c.createStatement();  
            
            // Connection success message
            System.out.println("Database connected successfully!");

        } catch (Exception e) { 
            // Print the error if the connection fails
            System.out.println("Database connection failed: " + e);
        }  
    }  

    // Method to close the connection when done
    public void closeConnection() {
        try {
            if (c != null) c.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            System.out.println("Error closing connection: " + e);
        }
    }

    // Main method to test the connection 
    public static void main(String[] args) {
        conn connection = new conn(); // Instantiate the conn class to test the connection
        connection.closeConnection(); // Optionally close the connection after use
    }
}
