package haveYouSeenRoboCup;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean againExt = false;
		boolean againInt = false;
		String yesOrNo = "";
		Scanner strScan = new Scanner(System.in);
		
		do{
			do{
				
			}while(letsGoAgain(yesOrNo, againInt, strScan));
		}while(letsGoAgain(yesOrNo, againExt, strScan));
	}
	
	public String[][] list (ArrayList <String> myList, char delim1, char delim2, char delim3){
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
