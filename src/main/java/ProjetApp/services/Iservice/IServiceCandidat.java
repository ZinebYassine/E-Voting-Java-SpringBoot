package ProjetApp.services.Iservice;

import java.util.List;

import ProjetApp.dao.entities.Candidat;
import ProjetApp.dao.entities.User;



public interface IServiceCandidat {
	public void ajouterCa(Candidat c);
	public void supprimerCa(Integer id);
	public void modifierCa(Candidat c);
	public List<User> listerCa();
	public Candidat rechercherCa(Integer id);

}
