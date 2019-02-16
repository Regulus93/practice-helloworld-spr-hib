package regulus93.helloworld.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import regulus93.helloworld.entity.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting,Long> {
	
	Optional<Greeting> findByLanguage(String lang);

}
