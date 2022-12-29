/*Avigayil Marcus
 * T00386137
 */

package program4;

public class mainWithExclusion {

	public static void main(String[] args) {
		
		//program with mutual exclusion
		
		Shared info = new Shared(1,false,false);
		Thread3 t1 = new Thread3(info);
		Thread4 t2 = new Thread4(info);
		
		t1.start();
		t2.start();

	}
	
}
