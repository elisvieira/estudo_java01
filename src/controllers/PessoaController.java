package controllers;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {
	private Scanner scanner = new Scanner(System.in);

	public void cadastrarPessoa() {
		try {

			System.out.println("\nCADASTRO DE PESSOA:");

			Pessoa pessoa = new Pessoa();

			System.out.print("Entre com o nome da pessoa....: ");
			pessoa.setNome(scanner.nextLine());

			System.out.print("Entre com o email da pessoa...: ");
			pessoa.setEmail(scanner.nextLine());

			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.save(pessoa);

			System.out.println("\nPESSOA CADASTRADO COM SUCESSO!");

		} catch (Exception e) {

			System.out.println("\nFALHA AO CADASTRAR PESSOA.");
			e.printStackTrace();
		}
	}

	public void atualizarPessoa() {
		try {

			System.out.println("\nATUALIZAR  PESSOA:");

			System.out.println("Informe o ID da pessoa desejadda.: ");
			Integer idPessoa = Integer.parseInt(scanner.nextLine());

			PessoaRepository pessoaRepository = new PessoaRepository();
			Pessoa pessoa = pessoaRepository.findById(idPessoa);

			if (pessoa != null) {
				System.out.println("Altere o nome....: ");
				pessoa.setNome(scanner.nextLine());
				System.out.println("Altere o email....: ");
				pessoa.setEmail(scanner.nextLine());

				pessoaRepository.update(pessoa);
				System.out.println("\nPESSOA ATUALIZADO COM SUCESSO!");
			} else {
				System.out.println("\nREGISTRO NÃO ENCONTRADO.");
			}
		} catch (Exception e) {
			System.out.println("\nFALHA AO ATUALIZAR PESSOA.");
			e.printStackTrace();
		}
	}

	public void excluirPessoa() {
		try {

			System.out.println("\nEXCLUIR  PESSOA:");

			System.out.println("Informe o ID da pessoa desejadda.: ");
			Integer idPessoa = Integer.parseInt(scanner.nextLine());

			PessoaRepository pessoaRepository = new PessoaRepository();
			Pessoa pessoa = pessoaRepository.findById(idPessoa);

			if (pessoa != null) {

				pessoaRepository.delete(pessoa);
				System.out.println("\nPESSOA EXCLUIDO COM SUCESSO!");
			} else {
				System.out.println("\nREGISTRO NÃO ENCONTRADO.");
			}
		} catch (Exception e) {
			System.out.println("\nFALHA AO EXCLUIR PESSOA.");
			e.printStackTrace();
		}
	}

	public void consultarPessoas() {
		try {
			PessoaRepository pessoaRepository = new PessoaRepository();
			List<Pessoa> lista = pessoaRepository.findAll();

			for (Pessoa pessoa : lista) {

				System.out.println(pessoa.toString());
			}

		} catch (Exception e) {
			System.out.println("\nFALHA AO CONSULTAR PESSOAs.");
			e.printStackTrace();
		}
	}

}