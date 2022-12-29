package program4;

public class Thread1 extends Thread {

	private Shared info;
	
	public Thread1(Shared i) {
		info = i;
	}
	@Override
	public void run() {
		//context switch
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		info.setT1WantsToEnter(true);
		
		while(info.getFavoredThread() == 2) {
			
			while (info.getT2WantsToEnter()) {
				System.out.println("t1 Waiting for t2 to exit\n");
			}
			info.setFavoredThread(1);
		}
		
		//start critical section
		System.out.println("T1 is currently in it's critical section\n");
		
		//context switch
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		//finish critical section
		System.out.println("T1 is exiting it's critical section.\n");
		
		info.setT1WantsToEnter(false);
		
		System.out.println("T1 is performing non critical code...\n ");
	


	}
	
}
