package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserServiceImp;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class HelloController {

	private UserServiceImp userServiceImp;

	public HelloController(UserServiceImp userServiceImp) {
		this.userServiceImp = userServiceImp;
	}

//	@GetMapping(value = "/")
//	public String printWelcome(ModelMap model) {
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
//		return "index";
//	}
	@GetMapping()
	public String listUsers(Model model) {
		model.addAttribute("users", userServiceImp.findAll());
		return "users";
	}
	@GetMapping("/new")
	public String newUser(@ModelAttribute("user") User user){
		return "/new";
	}
	@PostMapping()
	public String create(@ModelAttribute("user") User user){

		userServiceImp.save(user);
		return "redirect:/user";
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") long id){
		userServiceImp.delete(id);
		return "redirect:/user";
	}

	@GetMapping("/{id}/edit")
	public String edit(Model model, @PathVariable("id") long id){
		model.addAttribute("user", userServiceImp.find(id));
		return "/edit";
	}
	@PatchMapping("/{id}")
	public String update(@ModelAttribute("user") User user, @PathVariable("id") long id){
		userServiceImp.edit(id, user);
		return "redirect:/user";
	}


	
}