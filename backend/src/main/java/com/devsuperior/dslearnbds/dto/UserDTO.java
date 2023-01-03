package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UserDetails;

import com.devsuperior.dslearnbds.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	
	public UserDTO() {}

	public UserDTO(User entity)
	{
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
