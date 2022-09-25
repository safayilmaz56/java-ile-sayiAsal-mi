package sayiAsalMi;
 

public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		
		
		
		if(number == 1) {
			System.out.println("sayi asal degildir");
			return;
		}
		if(number < 1) {
			System.out.println("hatali bir sayi girdiniz");
		}
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("sayimiz asaldir");
		}
		else
			System.out.println("sayi asal degildir");

	}

}
