package ProjetApp.presentation;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ProjetApp.dao.entities.User;
import ProjetApp.services.Iservice.IServiceAdmin;
import lombok.AllArgsConstructor;



@Controller
@AllArgsConstructor
public class AdminController {
	public final IServiceAdmin ua;
	@GetMapping("/listerAdmin")
	public String getListAdmin(Model model) {
		List<User> list=ua.listerAd();
		model.addAttribute("list",list);
		return "indexAdmin";
	}
	@GetMapping("/addFormAdmin")
	public String getAddFormAdmin(Model model){
		return "formAjouterAdmin";
	}

}
