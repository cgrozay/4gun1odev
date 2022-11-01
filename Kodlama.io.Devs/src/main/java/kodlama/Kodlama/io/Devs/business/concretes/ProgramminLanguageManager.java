package kodlama.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguege> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguege getById(int id) {
		
		return this.programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguege programmingLanguege) throws Exception {
		for (int i = 0; i < programmingLanguageRepository.getAll().size(); i++) {
			if (programmingLanguageRepository.getAll().get(i).getName().equals(programmingLanguege.getName())) {
				throw new Exception("Bu isim zaten mevcut lütfen başka bir isim giriniz.");
			}else if (programmingLanguege.getName().isEmpty()) {
				throw new Exception("İsim boş geçilemez");
			}else {
				programmingLanguageRepository.add(programmingLanguege);
				System.out.println("Eklendi = "+ programmingLanguege.getName());
			}
		}
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
		System.out.println(programmingLanguege.getName());
		
	}

	@Override
	public void update(ProgrammingLanguege programmingLanguege, String name) {
		programmingLanguageRepository.update(programmingLanguege, name);
		
	}

	
}
