package com.learn.springboot.hcmapp.service;

import com.learn.springboot.hcmapp.model.CustomUserDetails;
import com.learn.springboot.hcmapp.model.User;
import com.learn.springboot.hcmapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsConfigService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("************* checking for user ************ ");
        User user = userRepository.findByName(userName);
        System.out.println("************* user ************ " + user);
        if(user == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        System.out.println("************* user exists ************ " + user.getName());
        return new CustomUserDetails(user);
    }
}
