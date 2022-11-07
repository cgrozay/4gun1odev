package kodlama.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.Kodlama.io.Devs.business.requests.CreateProgramminLanguageRequest;
import kodlama.Kodlama.io.Devs.business.responses.GetAllProgramminLanguageResponse;
import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgramminLanguageController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgramminLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgramminLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateProgramminLanguageRequest createProgramminLanguageRequest) throws Exception {
		this.programmingLanguageService.add(createProgramminLanguageRequest);
	}
}
