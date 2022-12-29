/*Avigayil Marcus
 * T00386137
 */
package program4;

public class Shared {
	private int favThread;
	private boolean t1WantsToEnter;
	private boolean t2WantsToEnter;

	public Shared(int i, boolean x, boolean y) {
		
		favThread = i;
		t1WantsToEnter = x;
		t2WantsToEnter = y;
	}

	public void setFavoredThread(int i) {
		favThread = i;
	}
	
	public int getFavoredThread() {
		return favThread;
	}
	
	public boolean getT1WantsToEnter() {
		return t1WantsToEnter;
	}
	
	public void setT1WantsToEnter(boolean i) {
		t1WantsToEnter = i;
	}
	
	public boolean getT2WantsToEnter() {
		return t2WantsToEnter;
	}
	
	public void setT2WantsToEnter(boolean i) {
		t2WantsToEnter = i;
	}

}
