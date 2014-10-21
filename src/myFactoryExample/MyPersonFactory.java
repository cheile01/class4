/**
 * 
 */
package myFactoryExample;

import myPackage.Person;
import myPackageImplementations.PersonImpl;

/**
 * @author cheile01
 *
 */
public class MyPersonFactory {
	public static Person getPerson(){
		return new PersonImpl();
	}

}
