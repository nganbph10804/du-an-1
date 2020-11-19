/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    public boolean insert(User entity) {
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
            if (rs > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(User entity) {
        String sql = "update du_an_1.user set  name=?,birth_day=? ,gender=?,phone=?,email=?,address=?  where user_id=?";

        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getBirthDay());
            ps.setString(3, entity.getGender());
            ps.setString(4, entity.getPhone());
            ps.setString(5, entity.getEmail());
            ps.setString(6, entity.getAddress());
            ps.setString(7, entity.getUserID());

            int rs = ps.executeUpdate();
            if (rs > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Object[]> selectBySQL() {
        List<Object[]> list = new ArrayList<>();
        String sql = "select user_id, username,name,birth_day,gender,phone ,email,address from user where status='1'";
        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] find = new Object[8];
                for (int i = 0; i < find.length; i++) {
                    find[i] = rs.getObject(i + 1);
                }
                list.add(find);
            }

        } catch (Exception e) {
        }
        return list;

    }

    @Override
    public User selectById(String key) {
        String sql = "select user_id, username,name,birth_day,gender,phone ,email,address from user where user_id=?";
        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User us = new User();
                us.setUserID(rs.getString("user_id"));
                us.setUserName(rs.getString("username"));
                us.setName(rs.getString("name"));
                us.setBirthDay(rs.getString("birth_day"));
                us.setGender(rs.getString("gender"));
                us.setPhone(rs.getString("phone"));
                us.setEmail(rs.getString("email"));
                us.setAddress(rs.getString("address"));
                return us;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public User login(String username, String password) throws Exception {
        String sql = "SELECT username, password,role FROM du_an_1.user where username =? and SHA1(UNHEX(SHA1(?))) and status=1";
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
        }
        return null;
    }

    public boolean changePassword(User entity) {
        String sql = "update  du_an_1.user set password=SHA1(?) where username=?";
        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getPassword());
            ps.setString(2, entity.getUserName());
            int rs = ps.executeUpdate();
            if (rs > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public User searchPhone(String key) {
        String sql = "select user_id, username,name,birth_day,gender,phone ,email,address from user where phone=? status='1'";
        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User us = new User();
                us.setUserID(rs.getString("user_id"));
                us.setUserName(rs.getString("username"));
                us.setName(rs.getString("name"));
                us.setBirthDay(rs.getString("birth_day"));
                us.setGender(rs.getString("gender"));
                us.setPhone(rs.getString("phone"));
                us.setEmail(rs.getString("email"));
                us.setAddress(rs.getString("address"));
                return us;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean disableUser(User entity) {
        String sql = "update du_an_1.user set status='2' where user_id=? ";

        try (
                Connection con = Connec.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, entity.getUserID());
            
            int rs = ps.executeUpdate();
            if (rs > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
}
