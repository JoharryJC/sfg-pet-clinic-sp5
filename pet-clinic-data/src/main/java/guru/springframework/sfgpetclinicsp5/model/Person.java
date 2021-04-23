package guru.springframework.sfgpetclinicsp5.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 
 */

@MappedSuperclass
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = -6458205070801349459L;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
