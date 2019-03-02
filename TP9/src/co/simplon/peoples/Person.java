package co.simplon.peoples;
import co.simplon.towns.City;

public class Person {
	private String name;
	private String fname;
	private int age;
	private String address;
	private City cityBirth;
	
	public Person(String name, String fname, int age, String address, City cityBirth) {
		this.name = name;	this.fname = fname;		this.age = age;		this.address = address;		this.cityBirth = cityBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return " name=" + name + " fname=" + fname + " age=" + age + " address=" + address + cityBirth;
	}	
}
