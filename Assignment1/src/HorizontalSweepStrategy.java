public class HorizontalSweepStrategy implements SearchStrategy{
	

	public void performSearch (int[][] grid){
		int noOfIteratings = 0;
		for(int i=0 ; i<25; i++) {
			for(int j =0; j<25;j++) {
				if (grid[i][j]!=0){
					if(grid[i][j]==1) {
					finalCoordinates[i][j] = 1;
					}
					else if(grid[i][j]==2) {
						finalCoordinates[i][j] = 2;
						}
					noOfIteratings++;
					System.out.println("Number of cells Searched:"+noOfIteratings);
			}
		} 
			

		}
	}	
}
