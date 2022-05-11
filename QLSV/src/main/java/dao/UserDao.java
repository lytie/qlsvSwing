/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
 
import entity.User;

/**
 *
 * @author HOANGTUAN
 */

public class UserDao {
    public boolean checkUser(User user) {
        if (user != null) {
            if ("admin".equals(user.getUserName()) 
                    && "admin".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}