package hw_while;

public class HwWhile02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i<=100) {
			i++;
			if(i%4==0) {
				System.out.println(i);
			}
			if(i%8==0) {
				sum += i;
			}
		}		
		System.out.println(sum);
	}
}
