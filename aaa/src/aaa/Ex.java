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
		
		Stream.generate(()->(int)(Math.random()*45+1))//���� ��Ʈ�� 1~45������ ���� ��ȯ
		.distinct()//�ߺ�����
		.limit(6) //6���� ���� ����
		.sorted() // �⺻����
		.map(i->i+",") // ���� ���ڿ��� ��ȯ
		.forEach(System.out::print);//���
		
		System.out.println();

		String tmp=Stream.generate(()->(int)(Math.random()*45+1))//���� ��Ʈ�� 1~45������ ���� ��ȯ
		.distinct()//�ߺ�����
		.limit(6) //6���� ���� ����
		.sorted() // �⺻����
		.map(i->i+"")
		.collect(Collectors.joining(","));
//		.forEach(System.out::print);//���
		
		System.out.println(tmp);
		System.out.println();
		IntStream.range(1,10).parallel().forEach(System.out::print);
		
	}

}
