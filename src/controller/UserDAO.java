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
import java.util.ArrayList;
import model.User;

/**
 *
 * @author Administrator
 */
public class UserDAO implements BaseDAO<User, String> {

    @Override
    public boolean insert(User entity)  {
        String sql = "INSERT INTO USER (USERNAME,PASSWORD,NAME,BIRTH_DAY,GENDER,PHONE,EMAIL,ADDRESS) VALUES(?,SHA1(?),?,?,?,?,?,?)";

        try (
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getUserName());
            ps.setString(2, entity.getPassword());
            ps.setString(3, entity.getName());
            ps.setString(4, entity.getBirthDay());
            ps.setString(5, entity.getGender());
            ps.setString(6, entity.getPhone());
            ps.setString(7, entity.getEmail());
            ps.setString(8, entity.getAddress());
            
            int rs = ps.executeUpdate();
            if(rs>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch(Exception e){
                return false;
        }
    }

    @Override
    public boolean update(User entity){
        String sql = "update set du_an_1.user where username=?, name=?,birth_day=? ,gender=?,phone=?,email=?,address=? ";

        try (
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getUserName());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getBirthDay());
            ps.setString(4, entity.getGender());
            ps.setString(5, entity.getPhone());
            ps.setString(6, entity.getEmail());
            ps.setString(7, entity.getAddress());
            
            int rs = ps.executeUpdate();
            if(rs>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch(Exception e){
                return false;
        }
    }

    @Override
    public boolean delete(String key){
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Object[]> selectBySQL() {
        List<User> list = new ArrayList<>();
        String sql ="select user_id, username,name,birth_day,gender,phonde ,email,adderss from du_an_1.user";
        try(
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql); 
                ) {
           
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User us = new User();
                us.setUserName(rs.getString("user_id"));
                us.setUserName(rs.getString("username"));
                us.setUserName(rs.getString("name"));
                us.setUserName(rs.getString("birth_day"));
                us.setUserName(rs.getString("gender"));
                us.setUserName(rs.getString("phonde"));
                us.setUserName(rs.getString("email"));
                us.setUserName(rs.getString("adderss"));
                list.add(us);
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public User selectById(String key) {
        List<User> list = new ArrayList<>();
        String sql ="select user_id, username,name,birth_day,gender,phonde ,email,adderss from du_an_1.user";
        try(
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql); 
                ) {
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                User us = new User();
                us.setUserName(rs.getString("user_id"));
                us.setUserName(rs.getString("username"));
                us.setUserName(rs.getString("name"));
                us.setUserName(rs.getString("birth_day"));
                us.setUserName(rs.getString("gender"));
                us.setUserName(rs.getString("phonde"));
                us.setUserName(rs.getString("email"));
                us.setUserName(rs.getString("adderss"));
                list.add(us);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (User)  list;
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

    public boolean changePassword(User entity){
        String sql = "update  du_an_1.user set password=SHA1(?) where username=?";

        try (
            Connection con = Connec.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getPassword());
            ps.setString(2, entity.getUserName());
            
            
            int rs = ps.executeUpdate();
            if(rs>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch(Exception e){
                return false;
        }
    }

}
