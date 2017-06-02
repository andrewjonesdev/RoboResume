package haveYouSeenRoboCup;

import java.util.ArrayList;

public class Job {
	private String jobTitle = "Graphic Designer";
	private ArrayList <String> duties = new ArrayList();
	public Job(){
		duties.add("Design Cards");
	}
	public Job(String jT){
		jobTitle = jT;
	}
	public String getJobTitle(){
		return jobTitle;
	}
	public void setJobTitle(String jT){
		jobTitle = jT;
	}
	public void addDuty(String d){
		duties.add(d);
	}
	public String getDutyAt(int d){
		return duties.get(d);
	}
	public void clearDuties(){
		duties.clear();
	}
	public int dutySize()
	{
		return duties.size();
	}
}
