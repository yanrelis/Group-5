
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
	
	
	/* The method below calculates the amount of time it will take for the job entered to be completed (including the duration
	of the job entered). */
	public int getCompletionTime(Job job)
	{
		int time = job.getJobDuration();
		Queue<Job> tempqueue = queue;
		Job currentJob = tempqueue.remove();
		
		while (currentJob.getJobID() != job.getJobID())
		{
			time += currentJob.getJobDuration();
			currentJob = tempqueue.remove();
		}
		
		return time;
	}
	
	public static void main(String[] args)
	{
		Job test = new Job(5, 5, "A", "B");
		Job test2 = new Job(10, 10, "C", "D");
		Job test3 = new Job(20, 20, "C", "D");
		Job test4 = new Job(30, 30, "C", "D");
		
		FIFOTest tester = new FIFOTest();
		tester.queueAdd(test);
		tester.queueAdd(test2);
		tester.queueAdd(test3);
		tester.queueAdd(test4);
		
		System.out.println(tester.getCompletionTime(test4));
	}
	
}
