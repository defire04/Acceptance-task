package com.example.Acceptance.task.sqlite;

import java.sql.*;

public class Database {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

//            statement.executeUpdate("drop table if exists person");
//            statement.executeUpdate("create table person (id integer, name varchar, surname varchar, birth_date TEXT)");
//            statement.executeUpdate("insert into person (id, name, surname, birth_date) values(1, 'Max', 'Petrov',  '2004-04-19')");
//            statement.executeUpdate("insert into person (id, name, surname, birth_date) values(2, 'Yui', 'Ruban', '2000-11-15')");

        } catch (SQLException e) {

            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
