package kodlama.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.Kodlama.io.Devs.business.requests.CreateProgramminLanguageRequest;
import kodlama.Kodlama.io.Devs.business.responses.GetAllProgramminLanguageResponse;
import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

public interface ProgrammingLanguageService {

	List<GetAllProgramminLanguageResponse> getAll();
	ProgrammingLanguege getById(int id);
	public void add(CreateProgramminLanguageRequest createProgramminLanguageRequest) throws Exception;
	
	
	
}
