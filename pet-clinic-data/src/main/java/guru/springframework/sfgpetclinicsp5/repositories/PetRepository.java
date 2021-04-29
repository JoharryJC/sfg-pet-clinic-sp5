package guru.springframework.sfgpetclinicsp5.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinicsp5.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
