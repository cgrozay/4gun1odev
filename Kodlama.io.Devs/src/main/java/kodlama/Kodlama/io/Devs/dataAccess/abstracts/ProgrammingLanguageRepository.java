package kodlama.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

public interface ProgrammingLanguageRepository {
	
	ProgrammingLanguege getById(int id);
	List<ProgrammingLanguege> getAll();
	void add(ProgrammingLanguege programmingLanguege);
	void delete(int id);
	void update(ProgrammingLanguege programmingLanguege,String name);

}
