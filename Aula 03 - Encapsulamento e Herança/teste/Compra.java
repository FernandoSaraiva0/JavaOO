package teste;

// Herança
	// Compra é filha de Cliente
public class Compra extends Cliente {
	
	String data;
	String hora;
	double valor;
	String comprador;
	
	public void teste() {
		comprar("Teste");
		addCart();
		devolver();
	}
	
}
