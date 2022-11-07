package kodlama.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.Kodlama.io.Devs.business.requests.CreateProgramminLanguageRequest;
import kodlama.Kodlama.io.Devs.business.responses.GetAllProgramminLanguageResponse;
import kodlama.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

@Service
public class ProgramminLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	private ProgrammingLanguege programmingLanguege;
	
	@Autowired
	public ProgramminLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository=programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgramminLanguageResponse> getAll() {
		List<ProgrammingLanguege> programmingLangueges =programmingLanguageRepository.findAll();
		List<GetAllProgramminLanguageResponse> getAllProgramminLanguageResponses=new ArrayList<GetAllProgramminLanguageResponse>();
		for (ProgrammingLanguege languege : programmingLangueges) {
			GetAllProgramminLanguageResponse getAllProgramminLanguageResponse=new GetAllProgramminLanguageResponse();
			getAllProgramminLanguageResponse.setId(languege.getId());
			getAllProgramminLanguageResponse.setName(languege.getName());
			getAllProgramminLanguageResponses.add(getAllProgramminLanguageResponse);
			
		}
		return getAllProgramminLanguageResponses;
	}

	@Override
	public ProgrammingLanguege getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CreateProgramminLanguageRequest createProgramminLanguageRequest) throws Exception {
		ProgrammingLanguege programmingLanguege=new ProgrammingLanguege();
		programmingLanguege.setName(createProgramminLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguege);
		
	}
	
	

	

	
	
	
	
}
