package guru.springframework.sfgpetclinicsp5.services;

import java.util.Set;

import guru.springframework.sfgpetclinicsp5.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
