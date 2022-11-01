package kodlama.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.Kodlama.io.Devs.entities.concretes.ProgrammingLanguege;

@Repository
public class InMemoryProgramminLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguege> programmingLangueges;
	

	public InMemoryProgramminLanguageRepository() {
		programmingLangueges = new ArrayList<ProgrammingLanguege>();
		programmingLangueges.add(new ProgrammingLanguege(1, "Java"));
		programmingLangueges.add(new ProgrammingLanguege(2, "C#"));
		programmingLangueges.add(new ProgrammingLanguege(3, "Python"));
		programmingLangueges.add(new ProgrammingLanguege(1,"JavaScript"));
	}

	@Override
	public List<ProgrammingLanguege> getAll() {

		return programmingLangueges;
	}

	@Override
	public void add(ProgrammingLanguege programmingLanguege) {
		programmingLangueges.add(programmingLanguege);

	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguege programmingLanguege : programmingLangueges) {
			if (programmingLanguege.getId()==id) {
				programmingLanguege.getId();
				System.out.println("Silindi ="+programmingLanguege.getName());
			}
		}
		
	}

	@Override
	public void update(ProgrammingLanguege programmingLanguege,String name) {
		programmingLangueges.get(programmingLanguege.getId()).setName(name);

	}

	@Override
	public ProgrammingLanguege getById(int id) {
		
		for (ProgrammingLanguege programmingLanguege : programmingLangueges) {
			if (programmingLanguege.getId()==id) {
				return programmingLanguege;
			}
			
		}
		return null;
	}

}
