package com.LoggitorApp.LoggitorApp.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long RoleId;
	@Column(unique=true)
	private String Role_name;
	private String Description;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Users> users;
	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	 @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE})
    @JoinTable(name = "Role_Permission", joinColumns = @JoinColumn(name = "Role_Id", referencedColumnName = "RoleId"),
    inverseJoinColumns = @JoinColumn(name = "permission_Id", referencedColumnName = "perId"))
    private Set<Permission> Permissions;
	public Set<Permission> getPermissions() {
		return Permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		Permissions = permissions;
	}

	public Role() {
		super();
	}
    


	public Role(String role_name, String description, Set<Permission> permissions) {
		super();
		Role_name = role_name;
		Description = description;
		Permissions = permissions;
	}

	public Role(String role_name, String description) {
		super();
		Role_name = role_name;
		Description = description;
	}

	public String getRole_name() {
		return Role_name;
	}

	public void setRole_name(String role_name) {
		Role_name = role_name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	


}
