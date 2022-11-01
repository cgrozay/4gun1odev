package kodlama.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguege> getAll();
	ProgrammingLanguege getById(int id);
	public void add(ProgrammingLanguege programmingLanguege) throws Exception;
	public void delete(int id);
	public void update(ProgrammingLanguege programmingLanguege,String name);
	
	
}
