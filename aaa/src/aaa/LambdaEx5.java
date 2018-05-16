package aaa;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {

	public static void main(String[] args) {
//Supplier<Integer> s=()->(int)(Math.random()*100)+1;
//Consumer<Integer> c=i->System.out.print(i+",");
//Predicate<Integer> p=i->i%2==0;
//Function<Integer, Integer> f=i->i/10*10;
		int i=21;
		i=i/10*10;
		System.out.println(i);
	}

}
