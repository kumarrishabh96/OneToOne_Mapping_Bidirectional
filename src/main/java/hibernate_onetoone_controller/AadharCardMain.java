package hibernate_onetoone_controller;
import hibernate_onetoone_dto.AadharCard;
import hibernate_onetoone_dto.Person;
import hibernate_onetoone_dao.AadharCardDao;

public class AadharCardMain {
public static void main(String[] args) {
	Person person=new Person();
	person.setId(1);
	person.setName("Kumar Rishabh");
	person.setEmail("rishabh.kumar0@gmail.com");
	person.setPhone(810211);
	person.setAddress("Patna");
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(101);
	aadharCard.setName("Kumar Rishabh");
	aadharCard.setDob("1994-06-09");
	aadharCard.setAddress("Patna");
	aadharCard.setPerson(person);
	person.setAadharCard(aadharCard);
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.saveAadhar(person);
	AadharCard aadharCard1=aadharCardDao.findAadhar(1);
	System.out.println(aadharCard1);
}
}
