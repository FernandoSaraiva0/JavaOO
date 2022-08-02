package teste;

public class Teste {
	public static void main(String[] args) {
		
		Funcionario funcionario01 = new Funcionario();
			// Objeto 01
			funcionario01.nome = "Fernanddo";
			funcionario01.cpf = 000000000000;
			funcionario01.idade = 22;
			funcionario01.salario = 1500.00;
			funcionario01.aumentarSalario(16.49);
		
		Funcionario funcionario02 = new Funcionario();
			// Objeto 02
			funcionario02.nome = "Alessandro";
			funcionario02.cpf = 000000001;
			funcionario02.idade = 23;
			funcionario02.salario = 1680.00;
			funcionario02.aumentarSalario(25.36);
		
	}
}
