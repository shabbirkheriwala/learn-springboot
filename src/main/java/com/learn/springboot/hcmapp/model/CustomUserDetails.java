package com.learn.springboot.hcmapp.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails extends User implements UserDetails {

    public CustomUserDetails(final User user) {
        super(user);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("************* CustomUserDetails : getAuthorities ************ ");
        Collection<SimpleGrantedAuthority> collection = new ArrayList<>();
        if(super.getName() != null && super.getName().equals("shabs")) {
            collection.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else if(super.getName() != null && super.getName().equals("test")) {
            collection.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        return collection;
    }

    @Override
    public String getUsername() {
        System.out.println("************* CustomUserDetails : getUsername ************ " +super.getName());
        return super.getName();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
