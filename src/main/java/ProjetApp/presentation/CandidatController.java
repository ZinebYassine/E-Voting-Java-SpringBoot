package ProjetApp.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ProjetApp.dao.entities.User;
import ProjetApp.services.Iservice.IServiceCandidat;
import lombok.AllArgsConstructor;



@Controller
@AllArgsConstructor
public class CandidatController {
	public final IServiceCandidat us;
	@GetMapping("/listerCandidat")
	public String getListCandidat(Model model) {
		List<User> list=us.listerCa();
		model.addAttribute("list",list);
		return "indexCandidat";
	}
	@GetMapping("/addForm")
	public String getAddFormCandidat(Model model) {
		return "formAjouterCandidat";
	}

}
