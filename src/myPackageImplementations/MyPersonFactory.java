/**
 * 
 */
package myPackageImplementations;

import myPackage.Person;

/**
 * @author cheile01
 *
 */
public class MyPersonFactory {
	public static Person getPerson(){
		return PersonImpl.create();
	}

}
