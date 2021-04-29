package guru.springframework.sfgpetclinicsp5.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinicsp5.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
