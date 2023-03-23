package com.example.BankSecurity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.example.BankModel.BankModel;

@Component
public class BankUserDetails implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3641609914991900480L;
	BankModel model;
	
	

	public BankUserDetails(BankModel model) {
		super();
		this.model = model;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("Bank"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return model.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return model.getUser_id();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
