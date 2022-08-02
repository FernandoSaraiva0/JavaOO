package teste;

public class Funcionario {
	
//	Atributos são Caracteristicas de um objeto
	String nome;
	double salario;
	int idade;
	int cpf;
	
// Método é uma função que essa classe executa
	void aumentarSalario(double aumento){
		this.salario += aumento;
		// Colocando a função para imprimir o nome e o novo
		// salário do funcionário
		System.out.println("O salario de "+ this.nome+" "+this.salario);
	}
}
