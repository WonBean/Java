package aaa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String b = scanner.nextLine();
		System.out.println(b);
		Choice c = new Choice();
		c.choose(new String[10]);
	}
}

class Choice {
	public void choose(String[] b) {
		for (int i = 0; i < b.length; i++)
			b[i] = i + "";
		Set<String> set = new HashSet<>();
		for (String a : b)
			set.add(a);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

}
