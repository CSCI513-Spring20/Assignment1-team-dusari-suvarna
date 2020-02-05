import java.util.*;
public interface SearchStrategy {
	List <String> carrierCoord = new ArrayList<>();
	List <String> submarineCoord = new ArrayList<>();
	public void performSearch(int[][] game);
}
