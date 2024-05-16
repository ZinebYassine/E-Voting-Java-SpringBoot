package ProjetApp.services.Iservice;

import java.util.List;

import ProjetApp.dao.entities.Electeur;
import ProjetApp.dao.entities.User;

public interface IServiceElecteur {
	public void ajouterEl(Electeur e);
	public void supprimerCa(Integer id);
	public void modifierCa(Electeur e);
	public List<User> listerEl();
	public Electeur rechercherEl(Integer id);

}
