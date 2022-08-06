package teste;

//Encapsulamento
	// Modificadores de Acesso

	/*
	 * public - Classe, Pacote, Subclasse, Todos
	 * private - Classe
	 * protected - Classe, Pacote, Subclasse
	 * Sem modificador - Classe, Pacote
	 * 
	 * */
public class Cliente {
	
	//	Propriedades
	public String nome;
	private String end;
	private int tel;
	private String email;
	
	// Métodos Especiais - Getters e Setters
	// Set -> Atribui um valor
	// Get -> Retorna um atributo
	
	public int getTel() {
		return this.tel;
	}
	
	public void setTel(int telefone) {
		this.tel = telefone;
	}
	
	public void comprar(String ende /* argumento */){
		this.end = ende;
		System.out.println("Produto Comprado "+end+" "+tel+" "+email);
	}
	
	protected void devolver() {
		System.out.println("Produto devolvido");
	}
	
	void addCart() {
		System.out.println("Produto adicionado");
	}
	
	public void rmCart() {
		System.out.println("Produto removido");
		for(int i = 0; i<=10; i++) {
			System.out.println(i+ " Produto removido");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

