package guru.springframework.sfgpetclinicsp5.services;

import guru.springframework.sfgpetclinicsp5.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
