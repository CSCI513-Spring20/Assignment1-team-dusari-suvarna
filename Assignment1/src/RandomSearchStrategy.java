
public class RandomSearchStrategy implements SearchStrategy{
	public void performSearch (int[][] grid){
		
        int noOfIteratings=0;
        int count = 0;
        //String str;
        int[][] result = new int[grid.length][grid.length];
        System.out.println("Strategy: "+"Random Sweep");
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
