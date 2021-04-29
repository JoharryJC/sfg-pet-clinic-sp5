package guru.springframework.sfgpetclinicsp5.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinicsp5.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

	Owner findByLastName(String lastName);
}
