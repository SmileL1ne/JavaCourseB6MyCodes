package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCConnection {

    public static void main(String[] args) {

        System.out.println("Hello, fellow user! Welcome to the airlines service, please enter your username: ");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        System.out.println("Good! Enter your password: ");
        String password = in.nextLine();

        String connectionUrl = "jdbc:postgresql://localhost:7777/airlines";
        String query = "select * from airlines_table;";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(connectionUrl, "postgres", "postgres");

            statement = connection.createStatement();

            resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("flight") + " " +
                        resultSet.getInt("flight_time"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }
}
