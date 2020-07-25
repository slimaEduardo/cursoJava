import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("NÃO NEGATIVO");
		}else
			System.out.println("NEGATIVO");
		
		sc.close();
		System.out.println("   ");
	}

}
