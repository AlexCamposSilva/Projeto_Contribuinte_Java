package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ContribuinteFisico;
import Entities.ContribuinteJuridico;
import Entities.Contribuintes;

public class ProgramContribuinte {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList<>();

		System.out.print("Qual o número de Contribuintes? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(" Fisica ou Jurídica? (f / j) ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome ");
			String nome = sc.nextLine();
			System.out.println("Renda Anual ");
			Double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.println("Despesas com saúde ");
				Double gastoComSaude = sc.nextDouble();

				list.add(new ContribuinteFisico(nome, rendaAnual, gastoComSaude));

			}
			if (ch == 'j') {
				System.out.println("Número de funcionários ");
				int numeroFuncionário = sc.nextInt();

				list.add(new ContribuinteJuridico(nome, rendaAnual,
						numeroFuncionário));
			}

		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS ");
		for (Contribuintes contribuintes : list) {

			System.out.println(contribuintes.getNome() + " :" + " $ " +
			String.format("%.2f",contribuintes.imposto() ) );
		}

		
		double sum = 0.0;
		for (Contribuintes contribuintes : list){
			sum+= contribuintes.imposto();
		}
		System.out.println();
		System.out.println("Total Taxas $ " + String.format("%.2f", sum));
		sc.close();
	}
}
