package nested_loops;

import java.util.Random;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
	}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String money = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		
int money1 = Integer.parseInt(money);

		// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "You could have " + money1*10 + " cents.");


		// Ask the user how tall they are (inches)

String height = JOptionPane.showInputDialog(null, "How tall are you? (in inches)");

int height1 = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
if (height1<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int i=0; i<30; i++){
	System.out.println(i+1);
}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

Random random = new Random();
int r = random.nextInt(20);
System.out.println(r);
		// Get another random number that is less than 10 and print it to the console 

int r1 = random.nextInt(20);
System.out.println(r1);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
int s =r-r1;
JOptionPane.showMessageDialog(null, "The difference between the two random numbers is "+ s +".");

		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog(null, "What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}


		// Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego");
}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = JOptionPane.showInputDialog(null, "How many cars does your family have?");
int carsnum = Integer.parseInt(cars);
if (carsnum==0) {
	JOptionPane.showInputDialog(null, "I bet you use public transportation.");
}
		// If there is 1 car, use a pop-up to display the make/model of the car 
else if (carsnum==1) {
	JOptionPane.showMessageDialog(null, "A toyota highlander 2016.");
}


		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else if (carsnum>=2) {
	JOptionPane.showMessageDialog(null, "Theree are 12 wheels between all of the cars.");
}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog(null, "What is the name of yoru school?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, school + "is a fantastic school!");

		}
}
