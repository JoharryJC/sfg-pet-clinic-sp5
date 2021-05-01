package guru.springframework.sfgpetclinicsp5.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinicsp5.model.Visit;
import guru.springframework.sfgpetclinicsp5.services.VisitService;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		// TODO Auto-generated method stub
		
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}
		
		return super.save(visit);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Visit visit) {
		// TODO Auto-generated method stub
		super.delete(visit);
	}

	
}
