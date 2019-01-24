package com.LoggitorApp.LoggitorApp.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository <Users, Long> {
//	@Query("SELECT USER.USER_ID, USER.USER_NAME , USER.PHONE, ROLE.ROLE_NAME" + 
//	 		" FROM USER " + 
//	 		"INNER JOIN USER_ROLE ON USER.USER_ID=USER_ROLE.USER_ID " + 
//	 		"INNER JOIN ROLE ON ROLE.ROLE_ID=USER_ROLE.ROLE_ID")
	@Query(nativeQuery=true)
   Set<UsersOnHP> getUsersOnHP();
   //=new ArrayList<UsersOnHP>();

}
