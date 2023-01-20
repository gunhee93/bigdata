package hw_while;

public class HwWhile01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int cnt = 0;
		int i = 0;
		while(i<11) {
			cnt += i;
			i++;
		}
		System.out.println(cnt);
	}
}
