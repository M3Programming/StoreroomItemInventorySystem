/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joe.Inventory.Repository;

import com.joe.Inventory.Model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author MJ
 */
public interface UserDetailRepository extends JpaRepository<UserDetail,Long>  {
   @Query(value="SELECT u FROM UserDetail u WHERE u.username = ?1")
	public UserDetail findByUsername(String username);
}
