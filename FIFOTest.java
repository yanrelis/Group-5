
import java.util.*;

public class FIFOTest {
	
	private Queue<Job> queue = new LinkedList<Job>();
	
	public FIFOTest()
	{
		queue = new LinkedList<Job>();
	}
	
	public void queueAdd(Job job)
	{
		queue.add(job);
	}
	
	public Job queueRemove()
	{
		return queue.remove();
	}
	
	public Job getCurrentJob()
	{
		return queue.element();
	}
	
	public static void main(String[] args)
	{
		Job test = new Job(5, 5, "A", "B");
		Job test2 = new Job(10, 10, "C", "D");
		
		FIFOTest tester = new FIFOTest();
		tester.queueAdd(test);
		tester.queueAdd(test2);
		
		Job currentJob = tester.getCurrentJob();
		System.out.println(currentJob.getJobDuration());
		tester.queueRemove();
		
		currentJob = tester.getCurrentJob();
		System.out.println(currentJob.getJobDuration());
	}
	
}
