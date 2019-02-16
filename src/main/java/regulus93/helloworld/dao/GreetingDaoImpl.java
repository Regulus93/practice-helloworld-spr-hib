package regulus93.helloworld.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import regulus93.helloworld.entity.Greeting;
import regulus93.helloworld.repository.GreetingRepository;

@Repository("greetingDao")
public class GreetingDaoImpl extends AbstractDao implements GreetingDao {

	@Autowired
	private GreetingRepository greetingRepository;
	
	public Greeting getGreeting(String lang) {
		return greetingRepository.findByLanguage(lang).orElseThrow(() -> new RuntimeException("No greeting found with the given language!"));
	}

}
