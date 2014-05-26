/**
** 	Author: Seamus Colloton           Date: 18-10-13
**
** 	Description:Rob the robot Robot class
*/

import java.io.*;
public class Robot
{	
	String name;
	int xPosition;
	int yPosition;
	
	// constructor
	public Robot(String name)
	{
		this.name = name;
	}
	// Assign x position
 	public void setXPos(int xPos)
	{
		xPosition = xPos;
		
	}
	// Assign y position
	public void setYPos(int yPos)
	{
		yPosition = yPos;
	}
	// Forward = increase Y position
	public void forward()
	{
		yPosition ++;
	}
	// Backward = decrease Y position
	public void back()
	{
		yPosition --;
	}
	// Right = increase X position 
	public void right()
	{
		xPosition ++;
	}
	// Left = decrease X position
	public void left()
	{
		xPosition -- ;
	}
	
	// Getters
	public int getX()
	{
		return xPosition;
	}
	public int getY()
	{
		return yPosition;
	}
	
	
}
