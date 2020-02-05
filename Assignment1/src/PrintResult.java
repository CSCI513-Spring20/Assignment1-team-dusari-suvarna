import java.util.*;
public class PrintResult {
	public PrintResult(List<String> carrier,List<String> submarine) {
		System.out.print("Carrier :"+carrier.get(0)+"to"+carrier.get(4)+"");
		//System.out.println("LIST1:"+carrier);
		//System.out.println("LIST2:"+submarine);
		System.out.println("submarine :"+submarine.get(0)+"to"+submarine.get(2));
		carrier.clear();
		submarine.clear();
}
}
