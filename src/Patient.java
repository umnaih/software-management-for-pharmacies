import java.util.LinkedList;
import java.util.ListIterator;
public class Patient {
	
	protected String id;
	protected String age;
	protected String name,surname,email, medicine, phoneNumber;
	protected String gender, address;
	 
	public Patient(String id, String age, String name, String surname, String email, String medicine,
			String phoneNumber, String gender, String address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.medicine = medicine;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", age=" + age + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", medicine=" + medicine + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", address="
				+ address + "]";
	}

}
