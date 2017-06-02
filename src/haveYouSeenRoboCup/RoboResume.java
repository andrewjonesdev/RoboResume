package haveYouSeenRoboCup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoboResume {
//Need To create object for person that inherits education experience and skills
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean againExt = false;
		boolean againInt = false;
		boolean againDuty = false;
		boolean keepLooping = false;
		String yesOrNo = "";
		Scanner strScan = new Scanner(System.in);
		Scanner numScan = new Scanner(System.in);
		String name = "";
		String email = "";
		ArrayList <String> resumeBullets = new ArrayList(); 
		String selection = "";
		String education = "";
		String work = "";
		String skill = "";
		String rating = "";
		int countBullets = 0;
		Education eduC = new Education();
		Work workC = new Work();
		Skill skillC = new Skill();
		
		System.out.println("Welcome to Robo Resume)");
		do{
			
			do{
				countBullets = 0;
				System.out.println("Please enter your name)");
				name = strScan.nextLine();
				if(!name.isEmpty()){
					keepLooping = false;
				}
				else{
					System.out.println("Your name was not recognized. Please try again)");
					keepLooping = true;
				}
			}while(keepLooping);
			do{
				System.out.println("Please enter your email)");
				email = strScan.nextLine();
				if (!email.isEmpty()&&(email.contains("@")&&(email.contains(".com")||email.contains(".gov")||email.contains(".org")||email.contains(".net")))){
				
					keepLooping = false;
				}
				else{
					System.out.println("Your email was not recognized. Please try again.");
					keepLooping = true;
				}
			}while(keepLooping);
			
			do{
				System.out.println("Select 1 to enter an Educational Achievement)\nSelect 2 to enter a Work Experience)\nSelect 3 to enter a Skill)");
				selection = strScan.nextLine();	
				do{
				if(selection.equals("1")||selection.equals("2")||selection.equals("3"))	
				{
					keepLooping = false;
					if(selection.equals("1")){
							//keepLooping = false;
							System.out.println("Enter an Educational Achievement)");
							System.out.println("What is the degree you have obtained?)");
							eduC.setHighestDegree("1" + strScan.nextLine());	
							System.out.println("What School did you attend?)");
							eduC.setSchool(strScan.nextLine());
							System.out.println("What was your major?)");
							eduC.setCourseOfStudy(strScan.nextLine());
							System.out.println("What year did you graduate?)");
							eduC.setGradYear(numScan.nextInt());
							resumeBullets.add(eduC.toString());
						}
					else if(selection.equals("2")){
						//keepLooping = false;
						System.out.println("Enter a Work Experience)");
						System.out.println("What is/was your job title during this experience?)");
						workC.setJobTitle("2"+strScan.nextLine());
						//System.out.print(workC.getJobTitle());
						System.out.println("Who is/was your employer?)");
						workC.setEmployer(strScan.nextLine());	
						System.out.println("What month and year did you start [ex. June 2016]?)");
						String [] monthYear = (strScan.nextLine()).split(" ");
						workC.setStartMonth(monthYear[0]);
						workC.setStartYear((Integer.parseInt(monthYear[1])));
						System.out.println("What month and year did you end [ex. June 2016]?)");
						monthYear = (strScan.nextLine()).split(" ");
						workC.setEndMonth(monthYear[0]);
						workC.setEndYear((Integer.parseInt(monthYear[1])));
						System.out.println("What were your duties?)");
						workC.clearDuties();
						do{
						System.out.println("Enter a duty)");
						workC.addDuty(strScan.nextLine());
						System.out.print("You can enter another duty. ");
						}while(letsGoAgain(yesOrNo, againDuty, strScan));
						resumeBullets.add(workC.toString());
					}
					else{
						//keepLooping = false;
						System.out.println("Enter a Skill)");
						System.out.println("Enter one of your skills)");
						skillC.setSkillName("3"+strScan.nextLine());	
						System.out.println("Enter a Rating for this Skill)");
						skillC.setRating(strScan.nextLine());
						//skill = "2"+skill+", "+rating;
						resumeBullets.add(skillC.toString());
					}
				}
				else{
					System.out.println("Invalid response. Please try again.");
					keepLooping = true;
				}
				}while(keepLooping);
				System.out.print("You can enter another achievement. ");
			}while(letsGoAgain(yesOrNo, againInt, strScan));
			System.out.println(resumeGenerator(name, email,listSort(resumeBullets, '1', '2', '3')));
			//Where the resume print goes
			System.out.print("You can enter another resume. ");
		}while(letsGoAgain(yesOrNo, againExt, strScan));
	}
	public static String resumeGenerator(String name, String email, String[][] achievements){
		String output = "";
		String[] edWoSk = {"Education:\n", "Work:\n", "Skills:\n"};
		output += (name +"\n");
		output += (email +"\n");
		
		for (int countExt = 0; countExt < achievements.length; countExt++){
			output+=("\n"+edWoSk[countExt]+"\n");
			for(int countInt = 0; countInt < achievements[0].length; countInt++){
				if(achievements[countExt][countInt].isEmpty()){
					countInt = achievements[0].length;
					//System.out.print("RB2");
				}
				/*else if (countInt==achievements[countExt].length-1||achievements[countExt][countInt+1].isEmpty()==true){
					output += (achievements[countExt][countInt].substring(1));
				}*/
				else{
					output += (achievements[countExt][countInt]+"\n");
					//System.out.print("RB");
				}
			}
			
		}
		
		
		return output;
	}
	public static  String[][] listSort (ArrayList <String> myList, char delim1, char delim2, char delim3){
		String[][] outputList = new String [3][20];
		for (String[] row: outputList){
			Arrays.fill(row, "");
		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
			for (int countExt = 0; countExt<myList.size(); countExt++){
				if(Character.toString(delim1).equals(myList.get(countExt).substring(0,1))){
				outputList[0][count1] = (myList.get(countExt)).substring(1);
				count1++;
				}
				else if(Character.toString(delim2).equals(myList.get(countExt).substring(0,1))){
					outputList[1][count2] = (myList.get(countExt)).substring(1);
					count2++;
					//System.out.print("LS");
					}
				else if(Character.toString(delim3).equals(myList.get(countExt).substring(0,1))){
					outputList[2][count3] = (myList.get(countExt)).substring(1);
					count3++;
					}
			}
			
		
		return outputList;
	}
	
	public static boolean letsGoAgain(String yesOrNo, boolean again, Scanner strScan){
		do{
			System.out.println("Do you want to continue? Y or N");
			yesOrNo = strScan.nextLine();
			//in case the user types "y" or "n" it will still go through
			yesOrNo = yesOrNo.toUpperCase();
			if(yesOrNo.equals("Y")){
				again = true;
			}
			else if(yesOrNo.equals("N")){
				again = false;
			}
			else{
				System.out.println("You didn't type \"Y\" or \"N\". please try again");
			}
			
		}while((!(yesOrNo.equals("Y"))) && (!(yesOrNo.equals("N"))));
		
		return again;
	}
	
}
