/* Project Milestone 4: Implementation
* Class: Job.java
* Author: Matthew Lardi
* Due: October 25, 2022
* This class is used to create objects pertaining to an individual Job and stores the
* specific ID, Name, Duration, and Information for each job in question. 
*/

public class Job {

	private int jobID;
	private int jobDuration;
	private String jobName;
	private String jobInfo;

	public Job() {
	}

	public Job(int jobID, int jobDuration, String jobName, String jobInfo) {
		this.jobID = jobID;
		this.jobDuration = jobDuration;
		this.jobName = jobName;
		this.jobInfo = jobInfo;
	}

	// sets the JobID of a job
	public void setJobID(int jobID) {
		this.jobID = jobID;

	}

	// returns the Job of the specified job
	public int getJobID() {
		return jobID;
	}

	// sets the duration of a job
	public void setJobDuration(int jobDuration) {
		this.jobDuration = jobDuration;
	}

	// returns the duration of the specified job
	public int getJobDuration() {
		return jobDuration;
	}

	// sets the name of a job
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	// returns the name of the specified job
	public String getJobName() {
		return jobName;
	}

	// sets the information of a job
	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}

	// returns a String of the information of the specified job
	public String getJobInfo() {
		String info = "The specified name and ID of this job are as follows: " + jobName + " " + jobID + " "
				+ "The duration of this job will be approximately " + jobDuration + " minutes.";

		return jobInfo;
	}

}
