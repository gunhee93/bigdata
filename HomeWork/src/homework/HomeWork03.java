package homework;

public class HomeWork03 {
	public static void main(String[] args) {
		//for¹® ¹®Á¦ 7
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				if(i%2==0) {
					System.out.printf("%2d ", (j+1) + (i*5));
				} else {
					System.out.printf("%2d ", (i+1)*5 - j);
				}
			//	System.out.printf("%2d ", i*5 + j);
			}
		}
	}
}
