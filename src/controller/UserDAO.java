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
    public void insert(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public User login(String username,String password) throws Exception{
        String sql ="SELECT username, password,role FROM du_an_1.user where username =? and SHA1(UNHEX(SHA1(?)))";
        try {
            
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                User us = new User();
                us.setUserName(username);
                String roleUse=null;
                us.setRole(rs.getString("role"));
                
                return us;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return null;
    }
    
}
