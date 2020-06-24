package com.Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Zahid");
		student.setEmail("asdf@asdf.com");
		
		Person person = new Person();
		person.setName("Zahid");
		person.setEmail("asdf@asdf.com");
		person.setPhone(1234567890);
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}

}
