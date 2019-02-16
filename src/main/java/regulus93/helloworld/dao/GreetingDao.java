package regulus93.helloworld.dao;

import regulus93.helloworld.entity.Greeting;

public interface GreetingDao {
	
	Greeting getGreeting(String lang);
}
