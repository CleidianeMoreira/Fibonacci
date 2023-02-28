import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int primeiro = 0;
		int segundo = 1;
		System.out.print("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		if(checaFibonacci(numero)) {
			System.out.println("Esse n�mero pertence a sequ�ncia de Fibonacci");
		}
		else {
			System.out.println("Esse n�mero n�o pertence a sequ�ncia de Fibonacci");
		}
			
		sc.close();
		}
		public static boolean checaFibonacci(int numero){
			if(numero==0 || numero==1) {
				return true;
			}
			return iteraFibonacci(numero,0,1);
		}
		public static boolean iteraFibonacci(int numero, int primeiro, int segundo) {
			if(segundo == numero ) {
				return true;
			}
			else if(segundo>numero) {
				return false;
			}
			else {
				return iteraFibonacci(numero, segundo, primeiro + segundo);
			}
		}
	

}
