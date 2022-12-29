package program4;

public class Thread4 extends Thread {

	private Shared info;
	
	public Thread4(Shared i) {
		info = i;
	}
	@Override
	public void run() {
		//context switch
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		info.setT2WantsToEnter(true);
		
		while(info.getFavoredThread() == 1) {
			while (info.getT1WantsToEnter()) {
				
				System.out.println("t2 Waiting for t1 to exit\n");
			}
			
			info.setFavoredThread(2);
			
		}
		//start critical section
		System.out.println("T2 is currently in it's critical section\n");
		
		System.out.println("T2 is exiting it's critical section.\n");
		
		info.setT2WantsToEnter(false);
		
		System.out.println("T2 is performing non critical code...\n ");
	

	}
}