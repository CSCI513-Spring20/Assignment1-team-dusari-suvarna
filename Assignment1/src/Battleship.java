import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Battleship {

	static SearchStrategy searchStrategy;	
	int carrier = 1;
	int submarine = 2;
	int gamecount;
	String line;
	Map<Integer, int[][]> mymap = new HashMap<Integer, int[][]>();
	int[][] grid = new int[25][25];
	
	public void readInputFile(){
		mymap = readcoordinateFile("src//input.txt");
	}

	public void setStrategy(SearchStrategy strategy){
		searchStrategy = strategy;
	}	
	
	public Map<Integer, int[][]> readcoordinateFile(String fileName){
		  try {
			  FileReader inputFile = new FileReader(fileName);
			  BufferedReader reader = new BufferedReader(inputFile);
			  while((line = reader.readLine()) != null) {
				  	gamecount = 1;
					StringTokenizer tokenizer = new StringTokenizer(line,"()");
					for(int i=0;i<8;i++) {
						
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
			  }
					mymap.put(gamecount,grid);
					for( int j = 0; j < grid.length; j++ )
						   Arrays.fill( grid[j], 0);
			  }
			  reader.close();
			  }
		  catch(Exception e) {
		  System.out.println("Exception occured "+e);
		  }
			return mymap;
		}
	
	
	public static void main(String[] args) {
		Battleship battleship = new Battleship();
		
		battleship.readInputFile();
			battleship.setStrategy(new HorizontalSweepStrategy());
			//battleship.performSearch();
			//battleship.setStrategy(new RandomSearchStrategy());
			//battleship.performSearch();
			//battleship.setStrategy(new StrategicSearchStrategy());
			//battleship.performSearch();
	}	
}
