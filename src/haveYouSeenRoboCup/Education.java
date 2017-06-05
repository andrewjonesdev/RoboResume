package haveYouSeenRoboCup;

public class Education {
	private String courseOfStudy = "";
	private String degree = "";
	private String school = "";
	private int gradYear = 0;
	
	public Education(){
		courseOfStudy = "Graphic Design";
		degree = "M.F.A.";
		school = "Arizona State University";
		gradYear = 2010;
	}
	public Education(String cOS, String deg, String sch, int gY){
		courseOfStudy = cOS;
		degree = deg;
		school = sch;
		gradYear = gY;
	}
	
	public String getCourseOfStudy(){
		return courseOfStudy;
	}
	public String getDegree(){
		return degree;
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
	public void setDegree(String deg){
		degree = deg;
	}
	public void setSchool(String sch){
		school = sch;
	}
	public void setGradYear(int gY){
		gradYear = gY;
	}
	public String toString(){
 
		
		return String.format("%s in %s\n%s, %s", degree, courseOfStudy, school, gradYear);
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
