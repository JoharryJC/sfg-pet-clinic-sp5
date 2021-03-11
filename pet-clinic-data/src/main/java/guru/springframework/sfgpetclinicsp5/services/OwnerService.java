package guru.springframework.sfgpetclinicsp5.services;

import java.util.Set;

import guru.springframework.sfgpetclinicsp5.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
}
