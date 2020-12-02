import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List <Double> lista_medias= new ArrayList<Double>();
		
		System.out.print("Digite a quantidade de Alunos: ");
		int num = input.nextInt();
		
		System.out.printf("\n");
		
		
		
		for (int cont = 0; cont < num; cont++) {
			
			System.out.printf("Aluno #%d\n", cont+1);
			System.out.print("Id: ");
			int id = input.nextInt(); input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.printf("\n");
			System.out.print("Digite a quantidade de notas: ");
			int num_not = input.nextInt();
			
			double[] notas = new double[num_not];
			
			
			double soma = 0;
			
			for (int cont2 = 0; cont2 < notas.length; cont2++) {
				
				System.out.printf("Nota %d: ", cont2+1);
				notas[cont2] = input.nextDouble();
				soma += notas[cont2];
				
			}
			
			double media = soma/notas.length;
			lista_medias.add(media);
			
			System.out.printf("\n");
		
		}
		
		for (int cont = 0; cont < num; cont++) {
			
			System.out.printf("Médias: %.2f\n", lista_medias.get(cont));
			
		}
		
		input.close();

	}

}
