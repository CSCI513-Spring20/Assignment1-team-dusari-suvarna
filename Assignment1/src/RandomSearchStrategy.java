
public class RandomSearchStrategy implements SearchStrategy{
	public void performSearch (int[][] grid){
		
		
        int noOfIteratings=0;
        int count = 0;int count1 = 0;
        //String str;
        int[][] result = new int[grid.length][grid.length];
        System.out.println("Strategy: "+"Random Search");
        while((count+count1) <8){
            int i= (int)(Math.random()*25);
            int j=(int)(Math.random()*25);
            //str = "("+i+","+j+")";
			if(grid[i][j]==1 && count<=4) {
				if(result[i][j] == 0) {
					result[i][j] = 1;
					//carrierCoord.add(String.valueOf("("+i+","+j+")"));
					count++;
				//System.out.println("LOSID: "+carrierCoord);
				//System.out.println("Count in one:"+count);
				}
			
			}
			else if(grid[i][j]==2 && count1<=2) {
				//if(submarineCoord.contains(str)){
				//System.out.println(i+","+j);
				if(result[i][j] == 0) {
				result[i][j] = 2;
				//submarineCoord.add(String.valueOf("("+i+","+j+")"));
				count1++;
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
