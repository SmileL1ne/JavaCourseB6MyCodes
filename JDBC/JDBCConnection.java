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

        String admin_username = "admin";
        String admin_password = "admin";
        boolean isAdmin = false;
        boolean isCommonUser = true;
        if (username.equals(admin_username) && password.equals(admin_password)){
            isAdmin = true;
            isCommonUser = false;
        }

        boolean isView = false;
        boolean isUpdate = false;
        boolean isDelete = false;

        if (isAdmin){
            System.out.println("What do you want to do? (delete, update, view): ");
            String answer = in.nextLine();
            switch (answer) {
                case "delete" -> isDelete = true;
                case "update" -> isUpdate = true;
                case "view" -> isView = true;
            }
        }

        String connectionUrl = "jdbc:postgresql://localhost:7777/airlines";
        String query = "select * from airlines_table;";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(connectionUrl, "postgres", "postgres");

            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            resultSet = statement.executeQuery(query);

            if((isAdmin && isView) || isCommonUser){
                while (resultSet.next()){
                    System.out.println(resultSet.getInt("id") + " " +
                            resultSet.getString("flight") + " " +
                            resultSet.getInt("flight_time"));
                }
            } else if (isDelete){
                System.out.println("Which row do you want to delete?: ");
                int row = Integer.parseInt(in.nextLine());
                resultSet.absolute(row);
                resultSet.deleteRow();
            } else if (isUpdate){
                System.out.println("Which column do you want to update?: ");
                int column = Integer.parseInt(in.nextLine());
                System.out.println("In which row do you want to update this column?: ");
                int row = Integer.parseInt(in.nextLine());
                resultSet.absolute(row);
                switch (column) {
                    case 1 -> System.out.println("Cannot change id");
                    case 2 -> {
                        System.out.println("Write the changed data: ");
                        String newFlight = in.nextLine();
                        resultSet.updateString(column, newFlight);
                    }
                    case 3 -> {
                        System.out.println("Write the changed data: ");
                        int newFlightTime = Integer.parseInt(in.nextLine());
                        resultSet.updateInt(column, newFlightTime);
                    }
                }
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
