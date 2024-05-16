package ProjetApp.services.serviceiml;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ProjetApp.dao.entities.Candidat;
import ProjetApp.dao.entities.User;
import ProjetApp.dao.repositories.IUserRepo;
import ProjetApp.services.Iservice.IServiceCandidat;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class ServiceCandidat implements IServiceCandidat {
	private final IUserRepo ur;

	@Override
	public void ajouterCa(Candidat c) {
		
		ur.save(c);
		
	}

	@Override
	public void supprimerCa(Integer id) {
		Optional<User> c=ur.findById(id);
		if(c.isEmpty()) {
			throw new RuntimeException("Candidat not found");
		}
		else {
			ur.deleteById(id);
		}
		
	}

	@Override
	public void modifierCa(Candidat c) {
		ur.save(c);
		
	}

	@Override
	public List<User> listerCa() {
		
		return ur.findAll();
	}

	@Override
	public Candidat rechercherCa(Integer id) {
		Optional<User> c=ur.findById(id);
		if(c.isEmpty()) {
			throw new RuntimeException("Candidat not found");
		}
		else {
			return (Candidat) c.get();
		}
		
	}

}
