package program4;

public class Thread3 extends Thread {

	private Shared info;
	
	public Thread3(Shared i) {
		info = i;
	}
	@Override
	public void run() {
		
		info.setT1WantsToEnter(true);
		
		while(info.getFavoredThread() == 2) {
			
			while (info.getT2WantsToEnter()) {
				System.out.println("t1 Waiting for t2 to exit\n");
			}
			info.setFavoredThread(1);
		}
		
		//start critical section
		System.out.println("T1 is currently in it's critical section\n");
		
		//finish critical section
		System.out.println("T1 is exiting it's critical section.\n");
		
		info.setT1WantsToEnter(false);
		
		//context switch
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
				
		System.out.println("T1 is performing non critical code...\n ");
	
	}
	
}
