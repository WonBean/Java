import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LamdaEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list.add(i);
		
		list.forEach(i -> System.out.println(i));
		System.out.println();
		
		System.out.println("= List.removeIf =");
		list.removeIf( x -> x%2 == 0 || x%3 == 0 );
		System.out.println(list);
		
		System.out.println();
		System.out.println("= List.replaceAll =");
		list.replaceAll( i -> i * 10);
		System.out.println(list);
		
		System.out.println();
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		System.out.println("= Map.forEach() =");
		map.forEach( (k,v) -> System.out.println("[" + k + ", " + v + "]" ) );
		System.out.println();
	}

}
