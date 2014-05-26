/**
** 	Author: Seamus Colloton    1234       Date: 18-10-13
**
** 	Description:Rob the robot
*
*/

import java.io.*;

public class Rob
{	

	// Clear Screen
	public static void clear()
	{
		for(int index = 0; index <=25; index++)
		{
			System.out.println();
		}
	}
	// Print Grid
	public static void printGrid(char array[][])
	{
		System.out.println("\n          GRID");
		System.out.println("  0-1-2-3-4-5-6-7-8-9");
		for(int row = 0; row < array.length; row++)
		{
			System.out.print(row + " ");
			for(int column = 0; column < array.length; column++)
			{
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
		
		
	}


	// Main
 	public static void main(String args[])
	{
		final int GRID_SQUARE = 10;
		int x;
		int y;
		int moveToX;
		int moveToY;
		int currentX;
		int currentY;
		int index;
		int row;
		int column;
		char footPrint = '*';
		// 2D array for grid
		char grid[][] = new char [GRID_SQUARE][GRID_SQUARE];
		for(row = 0; row < GRID_SQUARE; row++)
		{		
			for(column = 0; column < GRID_SQUARE; column++)
			{
				grid[row][column] = '-';
			}
		}
		// Print grid
		printGrid(grid);

		Robot rob = new Robot("rob");
		// Set X coordinates
		System.out.print("\nEnter X coordinates: ");
		x = EasyIn.getInt();
		// Check coordinate is on grid
		while(x < 0 || x > 9)
		{
			System.out.print("\nX must be in range 0-9. Enter X: ");
			x = EasyIn.getInt();
		}
		rob.setXPos(x);
		
		// Set Y coordinates
		System.out.print("Enter Y coordinates: ");
		y = EasyIn.getInt();
		// Check coordinate is on grid
		while(y < 0 || y > 9)
		{
			System.out.print("\nY must be in range 0-9. Enter Y: ");
			y = EasyIn.getInt();
		}
		rob.setYPos(y);	
		// Put rob on grid & print
		clear();
		grid[y][x] = 'R';
		printGrid(grid);
		// Get position
		currentX = rob.getX();
		currentY = rob.getY();
		// Get new positions
		System.out.print("\nEnter X coordinates to move to: ");
		moveToX = EasyIn.getInt();
		// Check coordinate is on grid
		while(moveToX < 0 || moveToX > 9)
		{
			System.out.print("\nX must be in range 0-9. Enter X: ");
			moveToX = EasyIn.getInt();
		}
		System.out.print("Enter Y coordinates to move to: ");
		moveToY = EasyIn.getInt();
		// Check coordinate is on grid
		while(moveToY < 0 || moveToY > 9)
		{
			System.out.print("\nY must be in range 0-9. Enter Y: ");
			moveToY = EasyIn.getInt();
		}

		// Move to new coordinates
		while(x != moveToX || y != moveToY)
			{
				// Reset previous position
				grid[currentY][currentX] = footPrint;
				if(y < moveToY)
					{
						rob.forward();
					}
				else if(y > moveToY)
					{
						rob.back();
					}
				// Check if rob has moved on y
				if(currentY != rob.getY())
				{
					// Check y position and print grid
					currentX = rob.getX();
					currentY = rob.getY();
					grid[currentY][currentX] = 'R';
					clear();
					printGrid(grid);
					// Reset previous position
					grid[currentY][currentX] = footPrint;
					// Wait before next move
					System.out.println("Press Enter To Move:");
					Keyboard.readChar();
				}
				if(x < moveToX)
					{
						rob.right();
					}
				else if(x > moveToX)
					{
						rob.left();
					}
				// Check if rob has moved on x
				if(currentX != rob.getX())
				{
					// Check x position and print grid
					currentX = rob.getX();
					grid[currentY][currentX] = 'R';
					clear();
					printGrid(grid);		
					// Wait before next move
					System.out.println("Press Enter To Move:");
					Keyboard.readChar();
				}
				// Update x and y
				x = rob.getX();	
				y = rob.getY();
			}
		currentX = rob.getX();	
		currentY = rob.getY();
	
		System.out.println("Final X coordinates: " + currentX);
		System.out.println("Final Y coordinates: " + currentY);

	}
	
}