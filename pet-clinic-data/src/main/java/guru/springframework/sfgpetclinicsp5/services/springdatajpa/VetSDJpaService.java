package guru.springframework.sfgpetclinicsp5.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinicsp5.model.Vet;
import guru.springframework.sfgpetclinicsp5.repositories.VetRepository;
import guru.springframework.sfgpetclinicsp5.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
	
	private final VetRepository vetRepository;
	
	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Vet> optionalVet = vetRepository.findById(id); 		
		return optionalVet.orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		vetRepository.deleteById(id);
		
	}

}
