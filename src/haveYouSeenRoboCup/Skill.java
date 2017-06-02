package haveYouSeenRoboCup;

import java.util.ArrayList;

public class Skill {
	private String skillName = "";
	private String rating = "";
	
	public Skill(){
		skillName = "Graphic Designer";
		rating = "Hallmark";
	}
	public Skill(String sN, String ra){
		skillName = sN;
		rating = ra;
	}
	
	public String getSkillName(){
		return skillName;
	}
	public String getRating(){
		return rating;
	}
	public void setSkillName(String sN){
		skillName = sN;
	}
	public void setRating(String ra){
		rating = ra;
	}
	
	public String toString(){
		return String.format("%s, %s", skillName, rating);
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
