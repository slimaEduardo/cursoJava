import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("N�O NEGATIVO");
		}else
			System.out.println("NEGATIVO");
		
		sc.close();
		System.out.println("   ");
	}

}
