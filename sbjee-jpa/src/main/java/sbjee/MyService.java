package sbjee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	private final EntityManager entityManager;

	@Autowired
	public MyService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Customer> doSomething() {
		TypedQuery<Customer> query = entityManager.createQuery(
				"select c from Customer c where c.firstName = :firstName",
				Customer.class);
		query.setParameter("firstName", "Phil");
		return query.getResultList();
	}

}
