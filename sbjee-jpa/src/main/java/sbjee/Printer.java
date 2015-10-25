package sbjee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class Printer implements CommandLineRunner {

	private final CustomerRepository repository;

	private final MyService myService;

	@Autowired
	public Printer(CustomerRepository repository, MyService myService) {
		this.repository = repository;
		this.myService = myService;
	}

	@Override
	public void run(String... args) throws Exception {
		Page<Customer> page = repository.findByFirstName("Phil", new PageRequest(0, 2));
		System.err.println(page);
		System.err.println(page.getContent());
		System.err.println(myService.doSomething());
	}

}
