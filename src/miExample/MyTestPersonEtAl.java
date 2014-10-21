/**
 * 
 */
package miExample;

/**
 * @author cheile01
 *
 */
public class MyTestPersonEtAl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getAge());
		
		Person p1 = new Academic();
		System.out.println(p1.getAge());
		
		Person p2 = new Student();
		System.out.println(p2.getAge());
		
		

	}

}
