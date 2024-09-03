/**
 * 
 */
package com.travelnest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelnest.entities.Login;
import com.travelnest.entities.User;
import com.travelnest.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository urepo;
	
	/*
	 * public User getUser(Login l) { return urepo.getUser(l); }
	 */
	
	
	public User getById(int uid) {
		return urepo.findById(uid).get();
	}
	
	public List<User> getUsersByAuthorization(int authorized) {
	    System.out.println(urepo.findByAuthorized(authorized));
        return urepo.findByAuthorized(authorized);
    }
 
 public List<User> getCustomerByRole(int role_id) {
	    System.out.println(role_id);
	    System.out.println(urepo.findByRoleId(role_id));
	    return urepo.findByRoleId(role_id);
    }
 
 public void approveUser(int userId) {
        User user = urepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        user.setAuthorized(1);
        urepo.save(user);
    }
 
 public void deleteUser(int userId) {
        User user = urepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        urepo.delete(user);
    }
	
}
