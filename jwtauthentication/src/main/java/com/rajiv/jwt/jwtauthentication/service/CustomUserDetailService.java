package com.rajiv.jwt.jwtauthentication.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// we are using hard coded user/pwd,but we should use repository for user detail
		if (username.equals("Rajiv")) {
			return new User("Rajiv", "India", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found !");
		}

	}

}
