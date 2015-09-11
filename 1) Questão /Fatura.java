package mlp;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorFatura(double preco, int quantidade) {
		double valor = quantidade * preco;
		if(valor<0 && preco <0.0){
			valor = 0;
			preco = 0.0;
		}
		return valor;

	}

}
