package com.ems.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//enum UserRole (ROLE_USER....)
@Entity
@Table(name = "sec_roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role extends BaseEntity {
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private UserRole role;
}
