package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.JPAPracticeApp.entity.Address;
import com.practice.jpa.JPAPracticeApp.entity.Student;
import com.practice.jpa.JPAPracticeApp.service.StudentDAOService;

@Component
public class StudentDAOServiceCommanLineRunner implements CommandLineRunner {

	@Autowired
	StudentDAOService studentDAOService;

	@Override
	public void run(String... args) throws Exception {

		// One to One Unidirectional Mapping Example

		Student sherlock = new Student("Sherlock");
		Address addressOfSherlock = new Address("Baker", "London", "UK");

		studentDAOService.insertAddress(addressOfSherlock);

		sherlock.setAddress(addressOfSherlock);

		studentDAOService.insertStudent(sherlock);

		// One to One Bi-Directional Mapping
		/*Student sherlock = new Student("Sherlock");
		Address addressOfSherlock = new Address("Baker", "London", "UK");

		sherlock.setAddress(addressOfSherlock);
		addressOfSherlock.setStudent(sherlock);

		studentDAOService.insertStudent(sherlock);*/


		// One to Many Mapping example
		/*Student shankar = new Student("Shankar");
		Address homeAddress = new Address("Bailur", "Udupi", "India");
		Address officeAddress = new Address("Nagawara", "Banglore", "India");

		userDAOService.insertAddress(homeAddress);
		userDAOService.insertAddress(officeAddress);
		List<Address> addressList = new ArrayList<>();
		addressList.add(homeAddress);
		addressList.add(officeAddress);
		shankar.setAddressList(addressList);
		userDAOService.insertStudent(shankar);

		System.out.println("Fetching Student data");
		Student student = userDAOService.getStudent();
		System.out.println("Student: " + student);

		System.out.println("Fetching Address List");
		List<Address> address = student.getAddressList();
		System.out.println("Address: " + address);*/
		
	}

}
