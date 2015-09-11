package mlp;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private boolean condicaoMotor;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public boolean isCondicaoMotor() {
		return condicaoMotor;
	}
	public void setCondicaoMotor(boolean condicaoMotor) {
		this.condicaoMotor = condicaoMotor;
	}
	public boolean ligar(){
		if(condicaoMotor == false){
			condicaoMotor = true;
			return true;
		}else{
			return true;
		}
		
	}
	public double acelerar(double velocidadeUp){
		setVelocidadeAtual(getVelocidadeAtual()+velocidadeUp);
		if(getVelocidadeAtual()>getVelocidadeMaxima()){
			System.out.println("velocidade máxima ultrapassada");
		}
		return velocidadeAtual;
	}

}
