package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public Integer id;
	public String name;
	public String surname;
	public String icon;
}