import java.util.concurrent.*;

public class concurrency{
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		int processorCount = (Runtime.getRuntime().availableProcessors()/5);
		System.out.println(processorCount);
		int threadsCount = 4; 
		ExecutorService exe = Executors.newFixedThreadPool(threadsCount);
		for(int i =0 ; i < processorCount; ++i) {
			exe.execute(runnable);
		}
	}
}