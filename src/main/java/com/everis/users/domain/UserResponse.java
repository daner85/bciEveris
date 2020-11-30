package com.everis.users.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class UserResponse {
	private final String nombre;
	private final UUID id;
	private final Date created;
	private final Date modified;
	private final LocalDateTime lastLogin;
	private final String token;
	private final String isActive;
	

	public UserResponse(UUID id, Date created, Date modified, LocalDateTime lastLogin, String active, String token, String nombre) {
		this.token = token;
		this.id = id;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
		this.isActive = active;
		this.nombre = nombre;
	}

	public UUID getId() {
		return id;
	}

	public Date getCreated() {
		return created;
	}

	public Date getModified() {
		return modified;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public String getToken() {
		return token;
	}

	public String getIsActive() {
		return isActive;
	}

	public String getNombre() {
		return nombre;
	}


	
	
}
