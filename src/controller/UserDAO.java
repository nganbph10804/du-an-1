/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import Connection.Connec;
import model.User;

/**
 *
 * @author Administrator
 */
public class UserDAO implements BaseDAO<User, String>{

    @Override
    public boolean insert(User entity) throws Exception {
        String sql ="INSERT INTO USER (USERNAME,PASSWORD,NAME,BIRTH_DAY,GENDER,PHONE,EMAIL,ADDRESS) VALUES(?,?,?,?,?,?,?,?)";

         try (
                 Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
                 ) {
            
            ps.setString(1, entity.getUserName());
            ps.setString(2, entity.getPassword());
            ps.setString(3, entity.getName());
            ps.setString(4, entity.getBirthDay());
            ps.setString(5, entity.getGender());
            ps.setString(6, entity.getPhone());
            ps.setString(7, entity.getEmail());
            ps.setString(8, entity.getAddress());
            
             return ps.executeUpdate()>0;
           
        } 
         
    }
    
    @Override
    public boolean update(User entity) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(String key) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Object[]> selectBySQL() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User selectById(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    public User login(String username, String password) throws Exception {
        String sql = "SELECT username, password,role FROM du_an_1.user where username =? and SHA1(UNHEX(SHA1(?)))";
        try {

            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setUserName(username);
                String roleUse = null;
                us.setRole(rs.getString("role"));

                return us;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
    
    public User changePassword(String username, String password) throws Exception {
        String sql = "update user set password =? where username=?";
        try {

            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setUserName(username);
                String roleUse = null;
                us.setRole(rs.getString("role"));

                return us;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
    
}
