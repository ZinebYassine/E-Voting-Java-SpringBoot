package ProjetApp.services.serviceiml;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ProjetApp.dao.entities.Admin;
import ProjetApp.dao.entities.Candidat;
import ProjetApp.dao.entities.User;
import ProjetApp.dao.repositories.IUserRepo;
import ProjetApp.services.Iservice.IServiceAdmin;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor

public class ServiceAdmin implements IServiceAdmin {
	private final IUserRepo ur;

	@Override
	public void ajouterAd(Admin c) {
		ur.save(c);
		
	}

	@Override
	public void supprimerAd(Integer id) {
		Optional<User> c=ur.findById(id);
		if(c.isEmpty()) {
			throw new RuntimeException("Admin not found");
		}
		else {
			ur.deleteById(id);
		}
		
	}

	@Override
	public void modifierAd(Admin c) {
		ur.save(c);

	}

	@Override
	public List<User> listerAd() {
		
		return ur.findAll();
	}

	@Override
	public Admin rechercherAd(Integer id) {
		Optional<User> c=ur.findById(id);
		if(c.isEmpty()) {
			throw new RuntimeException("Admin not found");
		}
		else {
			return (Admin) c.get();
		}
	
		
	}

}

