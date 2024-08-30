package com.rlaul.ik;

public class PaintFill {
	
	
	// Class name must be "Main"
	// Libraries included:
	// json simple, guava, apache commons lang3, junit, jmock
	/*
	Implement the "paint fill" function that one might see on many image editing programs that is given a screen (represented by a 2-dimensional array of colors), a point, and a new color fill in the surrounding area (up, down, left, right) until the color changes from the original color.

	# screen is the 2d matrix
	# x, y are your starting row, colomn,
	# ncolor is the new color

	Example:
	Starting at 1, 1 and ncolor is green,
	[[red, blue, blue],
	 [red, blue, green],
	 [blue, blue, red],
	]
	The end result is
	[[red, green, green],
	 [red, green, green],
	 [green, green, red],
	]
	*/
	
	
	/*
	main function find the original color
	call helper with coordinates, ocolor, and ncolor

	helper function
	if coordinate = ocolor update to new color
	recurse left
	recurse right
	recurse up
	recurse down
	 */


	/*
	screen[M][N] = {{red, blue, blue},
	{red, blue, green},
	{blue, blue, red},
	 }

	pColor = {x,y} 

	helper(screen, x+1, y, pColor, nColor)
	helper(screen, x-1, y, pColor, nColor)
	helper(screen, x, y+1, pColor, nColor)
	helper(screen, x, y-1, pColor, nColor) */

	
    public static void main(String[] args) {
        String screen[][] = {{"red", "blue", "blue"},
                        {"red", "blue", "green"},
                        {"blue", "blue", "red"}
                         };
        paintFill(screen, 1,1, "green");
        
       // int sum = add(10, 0);
        
    }

    
	public static void paintFill(String[][] screen, int x, int y, String nColor){
	    
	    String pColor = screen[x][y];
	    helper(screen, x,y, pColor, nColor);
	    
	    for (int i = 0; i < screen.length; i++)
	    {
	        for (int j = 0; j < screen[i].length; j++)
	        System.out.print(screen[i][j] + " ");
	        System.out.println();
	    }
	}

	public static void helper(String[][] screen, int x, int y, String pColor, String nColor){
	    
	    //base conditions
	    int N = screen.length;
	    int M = screen[0].length;
	    
	    if(x<0 || x >= M || y <0 || y>=N){
	        return;
	    }
	    
	    if(screen[x][y] != pColor)
	        return; 
	    
	    screen[x][y] = nColor;

	    helper(screen, x+1, y, pColor, nColor);
	    helper(screen, x-1, y, pColor, nColor);
	    helper(screen, x, y+1, pColor, nColor);
	    helper(screen, x, y-1, pColor, nColor);

	}



















}
