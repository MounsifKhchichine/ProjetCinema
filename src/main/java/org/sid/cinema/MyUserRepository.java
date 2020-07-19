//package org.sid.cinema;
//
//import org.sid.cinema.dao.UserRepository;
//import org.sid.cinema.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	
//	@Autowired
//	private UserRepository repo;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		User user = repo.findByUsername(username);
//		if(user==null) {
//			throw new UsernameNotFoundException("user not found");		
//		}
//		else {
//			
//		}
//		
//		return null;
//	}
//
//}