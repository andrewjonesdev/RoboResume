package haveYouSeenRoboCup;

public class Education {
	private String courseOfStudy = "";
	private String highestDegree = "";
	private String school = "";
	private int gradYear = 0;
	
	public Education(){
		courseOfStudy = "Graphic Design";
		highestDegree = "M.F.A.";
		school = "Arizona State University";
		gradYear = 2010;
	}
	public Education(String cOS, String hD, String sch, int gY){
		courseOfStudy = cOS;
		highestDegree = hD;
		school = sch;
		gradYear = gY;
	}
	
	public String getCourseOfStudy(){
		return courseOfStudy;
	}
	public String getHighestDegree(){
		return highestDegree;
	}
	public String getSchool(){
		return school;
	}
	public int getGradYear(){
		return gradYear;
	}
	public void setCourseOfStudy(String cOS){
		courseOfStudy = cOS;
	}
	public void setHighestDegree(String hD){
		highestDegree = hD;
	}
	public void setSchool(String sch){
		school = sch;
	}
	public void setGradYear(int gY){
		gradYear = gY;
	}
	public String toString(){
 
		
		return String.format("%s in %s\n%s, %s", highestDegree, courseOfStudy, school, gradYear);
	}

	public String consoleTextFormatter(String text, int nextLine)
	{
		String[] listOfStrings = text.split(" ");
		String output = "";
		for (int count = 0; count < listOfStrings.length; count++){
			if (count%nextLine==0 && count!=0){
				output+=(listOfStrings[count] + "\n");
			}
			else if(count == listOfStrings.length-1){
				output+=listOfStrings[count];
			}
			else{
				output+=(listOfStrings[count] + " ");
			}
				
		}
		return output;
	}
}
