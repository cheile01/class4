package myPackageImplementations;

import myPackage.Person;

public class PersonImpl implements Person {

	private int age;
	private boolean die;
	
	//making constructor private to avoid this method to be used to create a Person object
	private PersonImpl(){};
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public boolean die() {
		// TODO Auto-generated method stub
		return die;
	}
	
	@Override
	public String toString(){
		return "hello";
	}
	
	static Person create(){
		return new PersonImpl();
	}
	
	
}
