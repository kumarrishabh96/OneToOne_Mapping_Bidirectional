package hibernate_onetoone_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
private int id;
private String name;
private String address;
private String email;
private long phone;
@OneToOne(mappedBy="person")
private AadharCard aadharCard;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public AadharCard getAadharCard() {
	return aadharCard;
}
public void setAadharCard(AadharCard aadharCard) {
	this.aadharCard = aadharCard;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
			+ ", aadharCard=" + aadharCard + "]";
}
}