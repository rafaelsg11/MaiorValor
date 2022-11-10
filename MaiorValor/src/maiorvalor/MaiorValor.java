package maiorvalor;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		int n1, n2;
		
		Scanner enter = new Scanner(System.in);
		
		n1 = enter.nextInt();
		n2 = enter.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " eh maior que " + n2);
		} else {
			if(n2 > n1) {
				System.out.println(n2 + " eh maior que " + n1);
			} else {
				System.out.println("Os numeros sao iguais.");
			}
		}
	}
}