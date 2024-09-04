import java.util.Scanner;

public class DesafioTarget {

	public static void main(String[] args) {
		
//		1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
//		(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele 
//		calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para descobrir se pertence a sequencia de Fibonacci ");
		int num = sc.nextInt();
		
		boolean checagem = false;
		int x =0, y=1;
		int temp;
		
		for(int i=0; i <= num; i++) {
			temp = x;
			x = y;
			y +=temp;
			if(x == num) {
				checagem = true;
				break;
			}
		}
			if(checagem) {
				System.out.print("Seu numero esta na sequencia de Fibonacci!");
			}else {
				System.out.print("Seu numero nao esta na sequencia de Fibonacci!");
			}
		
		
//		2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
//		seja maiúscula ou minúscula,além de informar a quantidade de vezes em que ela ocorre.
//		
//		
//		System.out.print("Digite o um  texto: ");
//		String text = sc.nextLine();
//		text.toLowerCase();
//		int quantidadeA = 0;
//		boolean checagem = false;
//		
//		for(int i=0; i < text.length(); i++) {
//			char caracter = text.charAt(i);
//			if(caracter == 'a') {
//				checagem = true;
//				quantidadeA++;
//			}
//		}
//		
//		if(checagem) {
//			System.out.println("Existe o caracter 'a' no texto? " + checagem);
//			System.out.println("A ocorrencia de 'a' e: " + quantidadeA);
//		}else {
//			System.out.println("'a' nao existe nesse texto");
//		}
//		
		sc.close();
	}

}
