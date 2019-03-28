package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		Robot Charlie = new Robot();
		// 1. Create a new Robot

		// 2. Set the speed to 100
		Charlie.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "Which color do you want?", "Color",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Green", "Blue" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			Charlie.setPenColor(250, 0, 0);
		}
		if (colorChoice == 1) {
			Charlie.setPenColor(0, 250, 0);
		}
		if (colorChoice == 2) {
			Charlie.setPenColor(0, 0, 250);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog(null, "How many polygons do you want to be drawn?");
		// 5. Use the robot to draw the number of polygons the user requested.
		int polygonnum = Integer.parseInt(polygons);
		for (int i = 0; i < polygonnum; i++) {

			Charlie.penDown();
			Charlie.move(100);
			Charlie.turn(90);
			Charlie.move(100);
			Charlie.turn(90);
			Charlie.move(100);
			Charlie.turn(90);
			Charlie.move(100);
			Charlie.turn(90);
			Charlie.penUp();
			Charlie.move(101);

		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
