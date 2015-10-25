package sbjee;

import java.time.LocalDateTime;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Cacheable("mycache")
	public String lengthy(int id) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		return LocalDateTime.now().toString();
	}

}
