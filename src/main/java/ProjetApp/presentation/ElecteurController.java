package ProjetApp.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ProjetApp.dao.entities.User;
import ProjetApp.services.Iservice.IServiceElecteur;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ElecteurController {
	public final IServiceElecteur ue;
	@GetMapping("/listerElecteur")
	public String getListElecteur(Model model) {
		List<User> list=ue.listerEl();
		model.addAttribute("list",list);
		return "indexElecteur";
	}
	@GetMapping("/addFormElecteur")
	public String getAddFormElecteur(Model model) {
		return "formAjouterElecteur";
	}

}
