import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AlgorithmEx1 {

	public static void main(String[] args) {
		int[] item = new int[99];
		
		int[] arrNum = new int[100];
		for(int i = 0; i < arrNum.length; i++)
			arrNum[i] = i + 1;
		
		int min = arrNum[0];
		int max = arrNum[99];
		
		for(int j = 0; j < item.length; j++) {
			boolean isChange = true;
			int tmp = ThreadLocalRandom.current().nextInt(min, max + 1);
			for(int k = 0; k < item.length; k++) {
				if(tmp == item[k]) {
					isChange = false;
					j--;
					break;
				}
			}
			if(isChange == true)
				item[j] = tmp;
		}
		Arrays.sort(item);
		for(int m = 0; m < arrNum.length; m++)
			System.out.println("arrNum[" + m + "]: " + arrNum[m]);
		
		for(int m = 0; m < item.length; m++)
			System.out.println("item[" + m + "]: " + item[m]);
		
		
		int temp = -1;
		for(int i = 0; i < item.length; i++) {
			boolean isOK = true;
			for(int j = 0; j < arrNum.length; j++) {
				if(item ) {
					isOK = false;
					temp = arrNum[i];
					break;
				}
			}
			if(isOK == false)
				break;
		}
		System.out.println("안 넘긴 숫자: " + temp);
	}

}
