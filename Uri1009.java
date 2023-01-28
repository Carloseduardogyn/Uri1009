package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, vendas, bonus;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		bonus = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", bonus);
		
		sc.close();

	}

}
