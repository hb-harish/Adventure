import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		//display a welcome message
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i =8; i>0; i--)
		{
		System.out.println("\n\nYou find your way into a creepy house! You have " + i + " tries to escape");
		System.out.println("You see stairs that lead \"upstairs\" or a door that goes into the \"kitchen\"?");
		System.out.println("What would you like to do");
		String option1 = sc.next();
		if (option1.equals("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side");
			System.out.println("there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			String option2 = sc.next();
			if (option2.equals("refrigerator"))
			{
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.");
				System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
				String option3 = sc.next();
				if (option3.equals("no"))
					System.out.println("\nYou die of starvation   T_T ");
				else if (option3.equals("yes"))
					System.out.println("\nYou die of food poisoning   T_T");
				else 
					System.out.println("\nInvalid option your confusion causes your brain to haemorrhage and you die");
			}
			else if (option2.equals("cabinet"))
			{
				System.out.println("Inside the cabinet you see a \"jar\" and a \"box\", which one would you like to open");
				String option3 = sc.next();
				if (option3.equals("jar"))
					System.out.println("\nA snake was inside the jar!  You die from a snakebite   T_T ");
				else if (option3.equals("box"))
					System.out.println("\nThe box explodes, you die    T_T");
				else 
					System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
			}
			else 
				System.out.println("Invalid option you dont go anywhere and walk aimlessly till you are tired and die");
		}
		else if (option1.equals("upstairs"))
		{
			System.out.println("You see a long corridor at end of which there is a door to the \"bedroom\"");
			System.out.println("On your right side in the middle of the corridor is the door to the \"bathroom\"");
			System.out.println("Which door would you like to open");
			String option2 = sc.next();
			if (option2.equals("bedroom"))
			{
				System.out.println("Inside the bedroom you see a bed and a window.");
				System.out.println("Would you like to \"sleep\" in the bed or go to the \"window?\"");
				String option3 = sc.next();
				if (option3.equals("sleep"))
					System.out.println("You sleep and sleep and slip into a coma and die   T_T ");
				else if (option3.equals("window"))
				{
					System.out.println("There is rusty pipe next to the window and some tall grass below");
					System.out.println("Do you want to \"climb\" down the pipe or \"jump\" from the window");
					String option4 = sc.next();
					if (option4.equals("climb"))
						System.out.println("The pipe cant hold your wight, you fall down and the pipe falls on you and kills you   T_T");
					else if (option4.equals("jump"))
						System.out.println("There are spikes hidden in grass and you impale yourself and die    T_T");
					else 
						System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
				}
					
				else 
					System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
			}
			else if (option2.equals("bathroom"))
			{
				System.out.println("Inside the bathroom you see yourself in a mirror, you are bruised, bleeding and dirty");
				System.out.println("There is medicine box and a bathtub in the bathroom do you want to \"open\" the medicine box or take a \"bath\".");
				String option3 = sc.next();
				if (option3.equals("open"))
				{
					System.out.println("There are some capsules do you want to eat one? (\"yes\" or \"no\")");
					String option4 = sc.next();
					if (option4.equals("yes"))
						System.out.println("The medicine was actually poisonous, you die   T_T");
					else if (option4.equals("no"))
						System.out.println("Your wounds get infected and you die without medicine   T_T");
					else 
					System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
				}
				else if (option3.equals("bath"))
				{
					System.out.println("You step into the bath tub and you notice 2 buttons for the \"shower\" and \"bathtub\"?");
					System.out.println("Which button will you press");
					String option4 = sc.next();
					if (option4.equals("shower"))
						System.out.println("It is an acid shower you melt inside the bath tuba and your body is never found T_T");
					else if (option4.equals("bathtub"))
						System.out.println("The bathtub floor opens and you are thrown into a shark pit, death is your only escape  T_T");
					else 
					System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
				}
				else 
					System.out.println("Invalid option your confusion causes your brain to haemorrhage and you die");
			}
			else 
				System.out.println("Invalid option you dont go anywhere and walk aimlessly till your tired and die");
		}
		else if(option1.equals("escape"))
			{
				System.out.println("Congratualtions you did the right thing you leave the creepy house the exact way you came in");
				i =0;
			}
			
		else 
			System.out.println("Invalid option you dont go anywhere and walk aimlessly till your tired and die");
		
		}
			
		// TODO Auto-generated method stub

	}

}
