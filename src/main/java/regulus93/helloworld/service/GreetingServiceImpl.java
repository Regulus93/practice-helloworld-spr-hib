package regulus93.helloworld.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import regulus93.helloworld.dao.GreetingDao;
import regulus93.helloworld.entity.Greeting;

@Service("greetingService")
@Transactional
public class GreetingServiceImpl implements GreetingService{
	
	@Autowired
	private GreetingDao greetingDao;
	
	public Greeting getGreeting(String lang) {
		return greetingDao.getGreeting(lang);
	}
}
