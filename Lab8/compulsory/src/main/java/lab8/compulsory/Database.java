/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.compulsory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author G
 */
public class Database {
    private static final String URL =
"jdbc:postgresql://localhost:5432/albums";
private static final String USER = "postgres";
private static final String PASSWORD = "JiJiK2002";
private static Connection connection = null;

  
private Database() {}
public static Connection getConnection() throws SQLException {

  if (connection == null) {
    createConnection();
  }
  return connection;


}
private static void createConnection() {
  try {
    Class.forName("org.postgresql.Driver");
    connection = DriverManager.getConnection(URL, USER, PASSWORD);
    connection.setAutoCommit(false);
  } catch (ClassNotFoundException | SQLException e) {
    System.err.println(e);
  }
}
public static void closeConnection() {
  try {
    if (connection != null) {
      connection.close();
    }
  } catch (SQLException e) {
    System.err.println(e);
  }
}

}
