package guru.springframework.sfgpetclinicsp5.services;

import java.util.Set;

import guru.springframework.sfgpetclinicsp5.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
