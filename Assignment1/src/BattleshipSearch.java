import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class BattleshipSearch {
	static SearchStrategy searchStrategy;	
	int carrier = 1;
	int submarine = 2;
	int gamecount;
	int i;
	int noOfGame;
	String line;
	Map<Integer, int[][]> mymap = new HashMap<Integer, int[][]>();
	
	public void readInputFile(){
		mymap = readcoordinateFile("src//input.txt");
	}

	public void setStrategy(SearchStrategy strategy){
		searchStrategy = strategy;
	}	

	public void setNumber(int n){
		noOfGame = n;
	}		
	
	public Map<Integer, int[][]> readcoordinateFile(String fileName){
		  try {
			  FileReader inputFile = new FileReader(fileName);
			  BufferedReader reader = new BufferedReader(inputFile);
			  gamecount = 1;
			  while((line = reader.readLine()) != null) {
				  	i = 0;
					StringTokenizer tokenizer = new StringTokenizer(line,"()");
					int[][] grid = new int[25][25];
					while(tokenizer.hasMoreTokens()) {
						String element = tokenizer.nextToken();
						StringTokenizer tokenizer1 = new StringTokenizer(element,",");
						int x_cord = Integer.parseInt(tokenizer1.nextToken());
						int y_cord = Integer.parseInt(tokenizer1.nextToken());
						if(i<5) {
							grid[x_cord][y_cord] = carrier;
						}
						else {
							grid[x_cord][y_cord] = submarine;
						}
						i++;
			  }
					mymap.put(gamecount,grid);
					gamecount++;
					/*int[][] searchGrid = mymap.get(gamecount);
					gamecount++;
					for (int p = 0; p < searchGrid.length; p++)
					{
						for (int q = 0; q < searchGrid.length; q++)
						{
							if (searchGrid[p][q] == 1)
							{
								System.out.println("carrier"+p+","+q);
							}
							else if (searchGrid[p][q] == 2)
							{
								System.out.println("submarine"+p+","+q);
							}
								
						}
					}*/
					/*for( int j = 0; j < grid.length; j++ )
						   Arrays.fill( grid[j], 0);*/
			  }
			  reader.close();
			  }
		  catch(Exception e) {
		  System.out.println("Exception occured "+e);
		  }
			return mymap;
		}
	
	public void callSearch() {
			searchStrategy.performSearch(mymap.get(noOfGame));
	}	
	
	public static void main(String[] args) {
		BattleshipSearch battleship = new BattleshipSearch();
		
		battleship.readInputFile();
		for (int x=1;x<=3;x++) {
		battleship.setNumber(x);
		System.out.println("Game: "+x);
		battleship.setStrategy(new HorizontalSweepStrategy());
		battleship.callSearch();
		battleship.setStrategy(new RandomSearchStrategy());
		battleship.callSearch();
			//battleship.setStrategy(new StrategicSearchStrategy());
			//battleship.performSearch();
		}
	}	
}
