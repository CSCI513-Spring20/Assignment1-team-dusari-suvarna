
public class RandomSearchStrategy implements SearchStrategy{
	public void performSearch (int[][] grid){
		
		/*boolean[][] result = new boolean[grid.length][grid.length];		// Stores the results of the search
		boolean[][] searchGrid = new boolean[grid.length][grid.length];		// Stores the visited cells 
		int searchCount = 0;		// Stores the number of cells searched
		int foundCount = 0;			// Stores the number of cells found to contain a battleship
		// While the number of cells found is less than the total number of cells containing battleships...
		for (int k = 0; k < grid.length; k++) 
		{
			for (int l = 0; l < grid.length; l++) 
			{
				result[k][l] = false;
				searchGrid[k][l] = false;	
			}
		}
		while (foundCount < 8)
		{
			// Select random cell coordinates
			int i = rand.nextInt(25);
			int j = rand.nextInt(25);
			if (searchGrid[i][j] == true)			// If cell has already been searched...
			{
				while (searchGrid[i][j] == true)	// While we continue to choose a random cell that has already been searched...
				{
					// Select a new random cell
					i = rand.nextInt(25);	
					j = rand.nextInt(25);
				}
			}
			searchCount++;
			searchGrid[i][j] = true;				// Set this cell to 'searched'
			if (gameGrid[i][j] == true && result[i][j] != true)		// If the cell contains a battleship and we haven't already accounted for it...
			{
				foundCount++;
				result[i][j] = true;		// Account for the found cell in our return variable
				searchGrid[i][j] = true;
			}
		}
		System.out.println("Number of cells searched: " + searchCount);
	}
	}*/
		
        int noOfIteratings=0;
        int count = 0;
        //String str;
        int[][] result = new int[grid.length][grid.length];
        System.out.println("Strategy: "+"Random Sweep");
		for (int k = 0; k < grid.length; k++) 
		{
			for (int l = 0; l < grid.length; l++) 
			{
				result[k][l] = 0;
			}
		}
        while(count <8){
            int i= (int)(Math.random()*25);
            int j=(int)(Math.random()*25);
            //str = "("+i+","+j+")";
			if(grid[i][j]==1) {
				
				//if(carrierCoord.contains(str)) {
				//System.out.println(result[i][j]);
				//System.out.println(i+","+j);
				if(result[i][j] == 0) {
					result[i][j] = 1;
					//carrierCoord.add(String.valueOf("("+i+","+j+")"));
					count++;
				//System.out.println("LOSID: "+carrierCoord);
				//System.out.println("Count in one:"+count);
				}
			
			}
			else if(grid[i][j]==2) {
				//if(submarineCoord.contains(str)){
				//System.out.println(i+","+j);
				if(result[i][j] == 0) {
				result[i][j] = 2;
				//submarineCoord.add(String.valueOf("("+i+","+j+")"));
				count++;
				//System.out.println("Count in two:"+count);
				}
				}
            noOfIteratings++;
            
        }
		for (int p = 0; p < grid.length; p++) 
		{
			for (int q = 0; q < grid.length; q++) 
			{
				if(result[p][q] == 1)
					carrierCoord.add(String.valueOf("("+p+","+q+")"));
				else if(result[p][q] == 2)
					submarineCoord.add(String.valueOf("("+p+","+q+")"));
					
			}
		}
		System.out.println("Number of cells Searched:"+noOfIteratings);
		new PrintResult(carrierCoord,submarineCoord);        
    }
}
