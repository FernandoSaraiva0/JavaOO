package teste;

//Fases da Abstração
	//	Identidade
public class Cliente {
	
	//	Propriedades
	String nome;
	String end;
	int tel;
	String email;
	
	// Métodos
	
	void comprar(){
		System.out.println("Produto Comprado");
	}
	
	void devolver() {
		System.out.println("Produto devolvido");
	}
	
	void addCart() {
		System.out.println("Produto adicionado");
	}
	
	void rmCart() {
		System.out.println("Produto removido");
		for(int i = 0; i<=10; i++) {
			System.out.println(i+ " Produto removido");
		}
	}
}
