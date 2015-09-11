package mlp;

public class Locadora {
	private  String titulo;
	private double preco;

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(String tipo) {
		if(tipo.equals("infantil")){
			this.preco =getPreco()*1.40;
		}
		if(tipo.equals("lancamento")){
			this.preco =getPreco()*1.20;
	}


	}

}
