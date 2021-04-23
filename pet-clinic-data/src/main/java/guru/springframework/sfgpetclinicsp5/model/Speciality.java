package guru.springframework.sfgpetclinicsp5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

	private static final long serialVersionUID = -5670516995442671619L;
	
	@Column(name = "name")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
