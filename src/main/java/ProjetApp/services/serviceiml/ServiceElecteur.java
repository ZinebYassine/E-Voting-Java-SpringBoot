package ProjetApp.services.serviceiml;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ProjetApp.dao.entities.Electeur;
import ProjetApp.dao.entities.User;
import ProjetApp.dao.repositories.IUserRepo;
import ProjetApp.services.Iservice.IServiceElecteur;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class ServiceElecteur implements IServiceElecteur{
	private final IUserRepo ur;

	@Override
	public void ajouterEl(Electeur e) {
		ur.save(e);
		
	}

	@Override
	public void supprimerCa(Integer id) {
		Optional<User> e=ur.findById(id);
		if(e.isEmpty()) {
			throw new RuntimeException("Electeur not found");
		}
		else {
			ur.deleteById(id);
		}
		
	}

	@Override
	public void modifierCa(Electeur e) {
		ur.save(e);
		
	}

	@Override
	public List<User> listerEl() {
		return ur.findAll();
	}

	@Override
	public Electeur rechercherEl(Integer id) {
		Optional<User> e=ur.findById(id);
		if(e.isEmpty()) {
			throw new RuntimeException("Electeur not found");
		}
		else {
		
			return (Electeur) e.get();
		}
		
	}

}
