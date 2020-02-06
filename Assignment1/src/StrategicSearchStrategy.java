
public class StrategicSearchStrategy implements SearchStrategy{
	public void performSearch (int[][] grid){
        int noOfIteratings=0;
        int count = 0;
        int count1 = 0;
        int[][] result = new int[grid.length][grid.length];
        System.out.println("Strategy: "+"Strategic Sweep");
        while((count) !=5){
           int i= (int)(Math.random()*25);
           int j=(int)(Math.random()*25);
			if(grid[i][j]==1) {
			
				if(result[i][j] == 0) {
					result[i][j] = 1;
					count++;
					for(int k = 1;k<5;k++) {
						if (j!=24) {
					if(grid[i][j+k] == 1) {//Front
						result[i][j+k] = 1;

						count++;
					}
						}
						if (j>=k) {
						if(grid[i][j-k] == 1) {//Back
							result[i][j-k] = 1;
							count++;
						}}
						if (i>=k) {
						if(grid[i-k][j] == 1) {//Top
							result[i-k][j] = 1;
							count++;
						}}
						if (i!=24) {
						if(grid[i+k][j] == 1) {//bottom
							result[i+k][j] = 1;
							count++;
						}}
					}
				} 
			}
			noOfIteratings++;
	}

        while(count1 !=3){
            int i= (int)(Math.random()*25);
            int j=(int)(Math.random()*25);
		if(grid[i][j]==2) {
			if(result[i][j] == 0) {
				result[i][j] = 2;
				count1++;
				for(int k = 1;k<3;k++) {
				if(j!=24) {
				if(grid[i][j+k] == 2) {//Front
					result[i][j+k] = 2;
					count1++;
				}
				}
				if (j>=k) {
				if(grid[i][j-k] == 2) {//Back
					result[i][j-k] = 2;
					count1++;
				}}
				if (i>=k) {
				if(grid[i-k][j] == 2) {//Top
					result[i-k][j] = 2;
					count1++;
				}}
				if (i!=24) {
				if(grid[i+k][j] == 2) {//bottom
					result[i+k][j] = 2;
					count1++;
				}}
				}
			}
			noOfIteratings++;
		}
			}
		for (int p = 0; p < grid.length; p++) 
		{
			for (int q = 0; q < grid.length; q++) 
			{
				if(result[p][q] == 1)
				{	carrierCoord.add(String.valueOf("("+p+","+q+")"));
					//System.out.println("LOSID1: "+carrierCoord);
				}
				else if(result[p][q] == 2) {
					submarineCoord.add(String.valueOf("("+p+","+q+")"));
					//System.out.println("LOSID2: "+submarineCoord);
				}
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
