package ProjetApp.services.Iservice;

import java.util.List;

import ProjetApp.dao.entities.Admin;
import ProjetApp.dao.entities.User;

public interface IServiceAdmin {
	
	public void ajouterAd(Admin c);
	public void supprimerAd(Integer id);
	public void modifierAd(Admin c);
	public List<User> listerAd();
	public Admin rechercherAd(Integer id);
}
