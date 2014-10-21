/**
 * 
 */
package myTest;

import myFactoryExample.MyPersonFactory;
import myPackage.Person;
import myPackageImplementations.PersonImpl;

/**
 * @author cheile01
 *
 */
public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Person p= new PersonImpl();
		
		Person p = MyPersonFactory.getPerson();
		
		System.out.println(p.getClass());

	}

}
