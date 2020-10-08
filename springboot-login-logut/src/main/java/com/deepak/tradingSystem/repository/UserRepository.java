package com.deepak.tradingSystem.repository;

import com.deepak.tradingSystem.bean.AuthenticationBean;
import com.deepak.tradingSystem.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByusername(@Param("username")String username);
}
