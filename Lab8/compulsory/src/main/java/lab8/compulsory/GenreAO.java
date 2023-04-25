/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.compulsory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author G
 */
public class GenreAO {
     public void create(int id,String name) throws SQLException {
    Connection con = Database.getConnection();
    try (PreparedStatement pstmt = con.prepareStatement(
        "insert into genres (id,name) values (?,?)")) {
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
        }
    }
public Integer findByName(String name) throws SQLException {
    Connection con = Database.getConnection();
    try (Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(
    "select id from genres where name='" + name + "'")) {
    return rs.next() ? rs.getInt(1) : null;
    }
}
public String findById(int id) throws SQLException {
    Connection con = Database.getConnection();
    try (PreparedStatement pstmt = con.prepareStatement(
            "select name from genres where id = ?")) {
        pstmt.setInt(1, id);
        try (ResultSet rs = pstmt.executeQuery()) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
}
