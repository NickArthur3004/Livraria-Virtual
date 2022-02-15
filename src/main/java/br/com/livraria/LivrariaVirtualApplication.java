package br.com.livraria;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.livraria.controllers.LivrariaVirtualController;
import br.com.livraria.entities.Eletronico;
import br.com.livraria.entities.Impresso;
import br.com.livraria.entities.Livro;
import br.com.livraria.entities.Venda;
import br.com.livraria.repositories.LivroEletronicoRepository;

@SpringBootApplication
public class LivrariaVirtualApplication implements CommandLineRunner {

	@Autowired
	private LivrariaVirtualController controller;

	public static void main(String[] args) {
		SpringApplication.run(LivrariaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Eletronico eletronico = new Eletronico(null, "A menina q roubava livros", "Elizabete", "Carrosseu", 10.0F, 5);
		controller.Add(eletronico);

		Eletronico eletronico1 = new Eletronico(null, "Harry Potter", "J.K Rowling", "Saraiva", 30.0F, 15);
		controller.Add(eletronico1);

		Eletronico eletronico2 = new Eletronico(null, "Diario de um banana", "Jeff Kinney", "Saraiva", 15.0F, 9);
		controller.Add(eletronico2);

		Impresso impresso = new Impresso(null, "Trono de Vidro", "Sarah K", "endovie", 40.0F, 15.0F, 20);
		controller.AddImpresso(impresso);

		Impresso impresso1 = new Impresso(null, "Enola holmes", "Harry", "netfilx", 10.0F, 35.0F, 20);
		controller.AddImpresso(impresso1);

		Impresso impresso2 = new Impresso(null, "Guia do muchileiro das galaxias", "Garth", "Touchstone Pictures",
				12.0F, 20.0F, 20);
		controller.AddImpresso(impresso2);

		Venda venda = new Venda(null, "Nicolas", 70F, impresso2, null);
		Venda venda1 = new Venda(null, "Nicolas", 70F, null, eletronico);

		controller.AddVenda(venda1);
		controller.AddVenda(venda);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Utilize tanto o consoler como o postman para usar a api-rest");
		System.out.println();
		System.out.println("Pra ver o banco entre em http://localhost:8080/h2-console e aperte em connect");
		System.out.println();
		System.out.println();
		
		

		System.out.print("Deseja iniciar o programa?(s/n): ");
		char r = sc.next().charAt(0);

		while (r == 's') {
			if (r == 's') {

				System.out.println();
				System.out.println("Bem vindo a Livraria Virtual, oque deseja fazer?");
				System.out.println();
				System.out.println("1-Cadastrar Livro");
				System.out.println("2-Realizar Venda");
				System.out.println("3-Listar Livros impressos");
				System.out.println("4-Listar Livros Eletronicos");
				
				System.out.println();
				System.out.print("Digite o numero da opção: ");
				int r2 = sc.nextInt();
				
				if(r2 == 1) {
					
					System.out.println();
					System.out.println("Qual é o tipo de livro que você deseja cadastrar? Eletronico ou Impresso?(e/i) :");
					char l = sc.next().charAt(0);
					
					if(l == 'e') {
					
					sc.nextLine();
					System.out.println();
					System.out.print("Digite o titulo do livro: ");
					String titulo = sc.nextLine();
					System.out.print("Digite o autor do livro: ");
					String autor = sc.nextLine();
					System.out.print("Digite a editora do livro: ");
					String editora = sc.nextLine();
					System.out.print("Digite o preço do livro: ");
					float preço = sc.nextFloat();
					System.out.print("Digite o tamanho do livro: ");
					int tamanho = sc.nextInt();
					
					Eletronico livroEletronico = new Eletronico(null, titulo, autor, editora, preço, tamanho);
					controller.Add(livroEletronico);
					System.out.println();
					System.out.print("Seu livro foi cadastrado com sucesso!!!");
					}else if(l == 'i') {
						
						sc.nextLine();
						System.out.println();
						System.out.print("Digite o titulo do livro: ");
						String titulo = sc.nextLine();
						System.out.print("Digite o autor do livro: ");
						String autor = sc.nextLine();
						System.out.print("Digite a editora do livro: ");
						String editora = sc.nextLine();
						System.out.print("Digite o preço do livro: ");
						float preço = sc.nextFloat();
						System.out.print("Digite o frete do livro: ");
						float frete = sc.nextFloat();
						System.out.print("Digite o estoque do livro: ");
						int estoque = sc.nextInt();
						System.out.println();
						
						Impresso livroImpresso = new Impresso(null, titulo, autor, editora, preço, frete, estoque);
						controller.AddImpresso(livroImpresso);
						System.out.println();
						System.out.print("Seu livro foi cadastrado com sucesso!!!");
						}
					
				}
			}
			System.out.println();
			System.out.print("deseja voltar ao menu?(s/n) ");
			r = sc.next().charAt(0);
			System.out.println();
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Programa Encerrado!!!");
	}

}
