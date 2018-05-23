package aaa;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Solution1.soultion("13 DUP POP 6 + 7 - "));
		System.out.println(Solution1.soultion("13 DUP POP 6 + 7 - 5"));
	}

}

class Solution1 {
	public static int soultion(String str) {
		Stack<Integer> s = new Stack<>();
		String[] st = str.split(" +");
		// System.out.println(st.length);
		for (int i = 0; i < st.length; i++) {
			// if (st[i].equals("DUP")) System.out.println(st[i]);
			// if (st[i]=="DUP") System.out.println("asdad"+st[i]);
			if (st[i].equals("DUP"))
				try {
					s.push(Integer.valueOf(st[i - 1]));
				} catch (NumberFormatException e) {
				}
			if (st[i].equals("POP"))
				s.pop();
			if (st[i].equals("+"))
				s.push(s.pop() + s.pop());
			if (st[i].equals("-"))
				s.push(s.pop() - s.pop());
			else
				try {
					s.push(Integer.valueOf(st[i]));
				} catch (NumberFormatException e) {
				}
		}
//		 System.out.println(s.size());
		if (s.size() == 1) {
			if (s.peek() < 0)
				return -s.pop();
			return s.pop();
		}
		return -1;
	}
}