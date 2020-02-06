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
		System.out.println("Number of Cells searched:"+noOfIteratings);
}
	public void display(){
		System.out.print("Carrier found:"+carrierCoord.get(0)+"to"+carrierCoord.get(4)+"");
		//System.out.println("LIST1:"+carrier);
		//System.out.println("LIST2:"+submarine);
		System.out.println("Submarine found:"+submarineCoord.get(0)+"to"+submarineCoord.get(2));
		carrierCoord.clear();
		submarineCoord.clear();	
}
}
