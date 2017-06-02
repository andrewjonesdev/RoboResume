package haveYouSeenRoboCup;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {
//Need To create object for person that inherits education experience and skills
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean againExt = false;
		boolean againInt = false;
		boolean keepLooping = false;
		String yesOrNo = "";
		Scanner strScan = new Scanner(System.in);
		String name = "";
		String email = "";
		ArrayList <String> resumeBullets = new ArrayList(); 
		String selection = "";
		String education = "";
		String work = "";
		String skill = "";
		String rating = "";
		int countBullets = 0;
		System.out.println("Welcome to Robo Resume!");
		do{
			
			do{
				countBullets = 0;
				System.out.println("Please enter your name:");
				name = strScan.nextLine();
				if(!name.isEmpty()){
					keepLooping = false;
				}
				else{
					System.out.println("Your name was not recognized. Please try again.");
					keepLooping = true;
				}
			}while(keepLooping);
			do{
				System.out.println("Please enter your email:");
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
				System.out.println("Select 1 to enter an Educational Achievement)\nSelect 2 to enter a Work Experience)\nSelect 1 to enter a Skill)");
				selection = strScan.nextLine();	
				do{
				if(selection.equals("1")||selection.equals("2")||selection.equals("3"))	
				{
					keepLooping = false;
					if(selection.equals("1")){
							//keepLooping = false;
							System.out.println("Enter an Educational Achievement)");
							education = strScan.nextLine();	
							education = "1"+education;
							resumeBullets.add(education);
						}
					else if(selection.equals("2")){
						//keepLooping = false;
						System.out.println("Enter a Work Experience)");
						work = strScan.nextLine();	
						work = "2"+work;
						resumeBullets.add(work);
					}
					else{
						//keepLooping = false;
						System.out.println("Enter a Skill)");
						skill = strScan.nextLine();	
						skill = "2"+skill;
						//System.out.println("Enter a Rating for this Skill)");
						rating = strScan.nextLine();
						//skill = "2"+skill+", "+rating;
						resumeBullets.add(skill);
					}
				}
				else{
					System.out.println("Invalid response. Please try again.");
					keepLooping = true;
				}
				}while(keepLooping);
			}while(letsGoAgain(yesOrNo, againInt, strScan));
			listSort(resumeBullets, '1', '2', '3');
			//Where the resume print goes
			
		}while(letsGoAgain(yesOrNo, againExt, strScan));
	}
	
	public static  String[][] listSort (ArrayList <String> myList, char delim1, char delim2, char delim3){
		String[][] outputList = new String [2][20];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
			for (int countExt = 0; countExt<=myList.size(); countExt++){
				if(Character.toString(delim1).equals(myList.get(countExt).substring(0,1))){
				outputList[0][count1] = (myList.get(countExt)).substring(1);
				count1++;
				}
				else if(Character.toString(delim1).equals(myList.get(countExt).substring(0,1))){
					outputList[1][count2] = (myList.get(countExt)).substring(1);
					count2++;
					}
				else if(Character.toString(delim1).equals(myList.get(countExt).substring(0,1))){
					outputList[1][count3] = (myList.get(countExt)).substring(1);
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
