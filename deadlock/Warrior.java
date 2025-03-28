package deadlock;

public class Warrior implements Runnable {
String astra1 = new String("Sarpastra");
String astra2 = new String("Garudastra");
String astra3 = new String("Pasusatra");
@Override
public void run() {
  
	
}

public void arjunaAcquirResource() {
	try {
		Thread.sleep(5000);
		synchronized(astra1) {
			System.out.println(Thread.currentThread().getName()+
					"Has Acquired" + astra);
			
		}
	}
}
}
