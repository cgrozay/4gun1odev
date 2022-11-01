package kodlama.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgramminLanguageController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgramminLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguege> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/getid")
	public ProgrammingLanguege getId(int id) {
		return programmingLanguageService.getById(id);
	}
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguege programmingLanguege) throws Exception {
		 programmingLanguageService.add(programmingLanguege);
	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguageService.delete(id);
	}
	@PostMapping("/update")
	public void update(ProgrammingLanguege programmingLanguege,String name) {
		programmingLanguageService.update(programmingLanguege, name);
	}
}
