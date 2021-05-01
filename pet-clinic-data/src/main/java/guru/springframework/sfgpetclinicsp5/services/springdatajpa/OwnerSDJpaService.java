package guru.springframework.sfgpetclinicsp5.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinicsp5.model.Owner;
import guru.springframework.sfgpetclinicsp5.repositories.OwnerRepository;
import guru.springframework.sfgpetclinicsp5.repositories.PetRepository;
import guru.springframework.sfgpetclinicsp5.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinicsp5.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
		
	@Autowired
	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {		
		Optional<Owner> optionalOwner = ownerRepository.findById(id);
		
		return optionalOwner.orElse(null);
		
		/* este bloque es lo mismo que la linea de arriba 
   	    if (optionalOwner.isPresent()) {
			return optionalOwner.get();
		}
		else {
			return null;
		}
		*/
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		System.out.println("################################################");
		System.out.println("It's running save in @Profile(\"springdatajpa\")");
		System.out.println("It's running save in @Profile(\"springdatajpa\")");
		System.out.println("It's running save in @Profile(\"springdatajpa\")");
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastName);
	}

}
