/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joe.Inventory.Service;

import com.joe.Inventory.Model.CustomUserDetail;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.joe.Inventory.Repository.UserDetailRepository;
import com.joe.Inventory.Model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author MJ
 */
public class UserDetailService implements UserDetailsService {
   
@Autowired
	private UserDetailRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetail userDetail = userRepo.findByUsername(username);
		if (userDetail == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetail(userDetail);
	}
   
   
}
