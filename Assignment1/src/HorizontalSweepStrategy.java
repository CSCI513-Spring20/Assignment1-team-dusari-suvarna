public class HorizontalSweepStrategy implements SearchStrategy{

	public void performSearch (int[][] grid){
		int noOfIteratings = 0;
		System.out.println("Strategy: "+"Horizontal Sweep");
		for(int i=0 ; i<25; i++) {
			for(int j =0; j<25;j++) {
					if(grid[i][j]==1) {
						carrierCoord.add(String.valueOf("("+i+","+j+")")); 
					}
					else if(grid[i][j]==2) {
						submarineCoord.add(String.valueOf("("+i+","+j+")"));
						}
				if(carrierCoord.size() + submarineCoord.size() == 8)
					break;
					else
						noOfIteratings++;
					}
		}
		System.out.println("Number of cells Searched:"+noOfIteratings);
		new PrintResult(carrierCoord,submarineCoord);
}
}
