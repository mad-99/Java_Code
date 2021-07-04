public class DaemonThreadDemo extends Thread {
	static int i=4;
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			i++;
			System.out.println("its a deamon thread");
			System.out.println("........."+i);

		}
		else {
			i--;
			System.out.println("Normal thread");
			System.out.println("..............."+i);
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	DaemonThreadDemo t1 = new DaemonThreadDemo();
	DaemonThreadDemo t2 = new DaemonThreadDemo();
	DaemonThreadDemo t3 = new DaemonThreadDemo();
	DaemonThreadDemo t4 = new DaemonThreadDemo();
	t1.setDaemon(true);
	t1.start();
	t2.setDaemon(true);
	t2.start();
	//t3.setDaemon(true);
	t3.start();
	t4.start();
	}
}
