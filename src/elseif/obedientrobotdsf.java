package elseif;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobotdsf {
	static Robot r2d2=new Robot();
	public static void main(String[] args) {
		r2d2.penDown();
		r2d2.setSpeed(420);
		
	String john =JOptionPane.showInputDialog(null, "Wut shape do you wunt");
	
	if(john.equals("Square")) {
		drawSquare();
		
	}
	else if(john.equals("Triangle")) {
		drawTriangle();
	}
	else if(john.equals("Circle")) {
		drawCircle();
	}
             
	}
         
	
	public static void drawSquare() {
		for(int i=0;i<4;i++) {


			r2d2.move(100);
			r2d2.turn(360/4);
		}


	

	}
	public static void drawTriangle() {
		for (int i=0;i<3;i++) {
			r2d2.move(100);
			r2d2.turn(360/3);
		}
	}
 public static void drawCircle() {
	 for (int i=0;i<360;i++) {
		 r2d2.move(1);
		 r2d2.turn(360/360);
	 }
 }


}

