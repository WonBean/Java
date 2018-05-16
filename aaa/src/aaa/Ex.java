package aaa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.forEach(i -> System.out.print(i + ","));
		System.out.println();

		list.stream().distinct().forEach(System.out::print);
		
		System.out.println();
//		Iterator it=list.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next());
//		}
		list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println();
		list.stream().distinct().sorted((i,i2)->i2.compareTo(i)).map(i->i*10+",").forEach(System.out::print);
		System.out.println();
		
		Stream.generate(()->(int)(Math.random()*45+1))//무한 스트림 1~45까지의 난수 반환
		.distinct()//중복제거
		.limit(6) //6개로 값을 제한
		.sorted() // 기본정렬
		.map(i->i+",") // 값을 문자열로 변환
		.forEach(System.out::print);//출력
		
		System.out.println();

		String tmp=Stream.generate(()->(int)(Math.random()*45+1))//무한 스트림 1~45까지의 난수 반환
		.distinct()//중복제거
		.limit(6) //6개로 값을 제한
		.sorted() // 기본정렬
		.map(i->i+"")
		.collect(Collectors.joining(","));
//		.forEach(System.out::print);//출력
		
		System.out.println(tmp);
		System.out.println();
		IntStream.range(1,10).parallel().forEach(System.out::print);
		
	}

}
