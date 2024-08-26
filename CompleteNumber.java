package practise2;

// برنامه‌ای  که اعداد کامل کوچکتر از 10,000 را چاپ میکند

import java.util.ArrayList;

public class CompleteNumber {

	static ArrayList<Integer> fNumbers = new ArrayList<>();

	//	بدست آوردن مقسوم علیه های عدد صحیح ورودی بجز خودش
	static void divisor (int num) {	
		fNumbers.clear();     // پاک کردن آرایه برای اطمینان از عدم وجود مقادیر قبلی 
		for(int firstNum = 1 ; firstNum < num ; firstNum++) {
			for(int secondNum = 1 ; secondNum <= num; secondNum++) {
				int res = firstNum * secondNum;
				if(res == num) 
					fNumbers.add(firstNum);
			}
		}
	}

	//	جمع مقادیر آزایه با هم
	static int sumArray () {
		int sum = 0;
		for(int number : fNumbers)
			sum += number;
		return sum;
	}

	public static void main(String[] args) {	
		for(int i = 1 ; i < 10000 ; i++) {
			divisor(i);
			int result = sumArray();
			if (result == i)
				System.out.println(i);
		}
	}

}