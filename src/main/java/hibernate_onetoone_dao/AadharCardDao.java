package hibernate_onetoone_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_onetoone_dto.AadharCard;
import hibernate_onetoone_dto.Person;

public class AadharCardDao {
public void saveAadhar(Person person) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kumar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	AadharCard aadharCard=person.getAadharCard();
	entityTransaction.begin();
	entityManager.persist(aadharCard);
	entityManager.persist(person);
	entityTransaction.commit();
}
public AadharCard findAadhar(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kumar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	AadharCard aadharCard=entityManager.find(AadharCard.class, id);
	return aadharCard;	
}
}