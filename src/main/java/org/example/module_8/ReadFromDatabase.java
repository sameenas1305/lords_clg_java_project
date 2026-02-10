package org.example.module_8;

import java.sql.*;

public class ReadFromDatabase {

    static final String DATABASE_URL =
            "jdbc:mysql://localhost:3306/lords_clg?useSSL=false&serverTimezone=UTC";
    static final String USERNAME = "root";
    static final String PASSWORD = "sameenas1305";

    public static void main(String[] args) {

        try {
            // Step 1: Load JDBC Driver (IMPORTANT)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open connection
            Connection conn = DriverManager.getConnection(
                    DATABASE_URL, USERNAME, PASSWORD);

            // Step 3: Execute query
            Statement stmt = conn.createStatement();
            ResultSet data = stmt.executeQuery("SELECT * FROM teachers");

            // Step 4: Read data
            while (data.next()) {
                System.out.println(
                        data.getInt("id") + " - " +
                                data.getString("name") + " - " +
                                data.getLong("number")
                );
            }

            // Step 5: Close connection
            conn.close();

        } catch (Exception e) {
            // This prevents Gradle from crashing silently
            e.printStackTrace();
        }
    }
}
