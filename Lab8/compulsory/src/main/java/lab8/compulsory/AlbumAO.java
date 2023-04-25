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
public class AlbumAO {
     public void create(int id,int relyear,String title) throws SQLException {
    Connection con = Database.getConnection();
    try (PreparedStatement pstmt = con.prepareStatement(
        "insert into albums (id, relyear, title) values (?,?,?)")) {
        pstmt.setInt(1, id);
        pstmt.setInt(2,relyear);
        pstmt.setString(3, title);
        pstmt.executeUpdate();
        }
    }
public Integer findByTitle(String title) throws SQLException {
    Connection con = Database.getConnection();
    try (Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(
    "select id from albums where name='" + title + "'")) {
    return rs.next() ? rs.getInt(1) : null;
    }
}
public String findById(int id) throws SQLException {
    Connection con = Database.getConnection();
    try (PreparedStatement pstmt = con.prepareStatement(
            "select name from albums where id = ?")) {
        pstmt.setInt(1, id);
        try (ResultSet rs = pstmt.executeQuery()) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
}
