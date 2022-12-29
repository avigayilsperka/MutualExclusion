/*Avigayil Marcus
 * T00386137
 */

package program4;

public class mainProgram {

	public static void main(String[] args) {

		//program without mutual exclusion
		Shared info = new Shared(1,false,false);
		Thread1 t1 = new Thread1(info);
		Thread2 t2 = new Thread2(info);
		
		t1.start();
		t2.start();

	}
	
} 
