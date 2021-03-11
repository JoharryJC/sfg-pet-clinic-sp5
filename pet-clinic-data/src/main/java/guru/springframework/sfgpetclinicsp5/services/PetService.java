package guru.springframework.sfgpetclinicsp5.services;

import java.util.Set;

import guru.springframework.sfgpetclinicsp5.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
