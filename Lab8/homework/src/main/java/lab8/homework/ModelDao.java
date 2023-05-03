/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author G
 */
public abstract class ModelDao {
    protected String tableName;
    protected String name;
    protected String title;
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void create(int id,String s) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into " + tableName + " values (?,?)",
                Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, s);
            pstmt.executeUpdate();
            
        }
    }

    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
        "select id from " + tableName +" where name='" + name + "'")) {
        return rs.next() ? rs.getInt(1) : null;
        }
    }
   
    public Integer findByTitle(String title) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
        "select id from " + tableName +" where name='" + title + "'")) {
        return rs.next() ? rs.getInt(1) : null;
        }
    }
   

    public String findById(int id) throws SQLException {
    Connection con = Database.getConnection();
    try (PreparedStatement pstmt = con.prepareStatement(
            "select name from" + tableName + "where id = ?")) {
        pstmt.setInt(1, id);
        try (ResultSet rs = pstmt.executeQuery()) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
}
