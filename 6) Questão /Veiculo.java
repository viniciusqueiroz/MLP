package mlp;

public class Veiculo {
	protected String placa;
	protected String marca;
	protected String modelo;
	protected String ano;
	protected double valorKmRodado;
	protected double KmInicial;
	protected double KmFinal;
	protected double ValorLocacao;

	public Veiculo(String placa, String marca, String modelo, String ano, double kmInicial, double kmFinal, double valorKmRodado){
		setPlaca(String placa);
		setMarca(String marca);
		setModelo(String modelo);
		setAno(String ano);
		setKmInicial(String kmInicial);
		setKmFinal(String kmFinal);
		setValorKmRodado(String valorKmRodado);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public double getKmInicial() {
		return KmInicial;
	}

	public void setKmInicial(double kmInicial) {
		KmInicial = kmInicial;
	}

	public double getKmFinal() {
		return KmFinal;
	}

	public void setKmFinal(double kmFinal) {
		KmFinal = kmFinal;
	}

	public double ValorLocacao(){
		this.ValorLocacao = (this.kmInicial-this.KmFinal)*this.valorKmRodado; //professor, na lista a formula é essa, mas acredito que o certo seria (this.kmFinal-this.KmInicial)*this.valorKmRodado
		return ValorLocacao

	}
}
