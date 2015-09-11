package mlp;

public class Principal {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		Lapis l = new Lapis(q);
		l.desenha();
		
		Circulo c = new Circulo();
		Lapis l1 = new Lapis(c);
		l1.desenha();
		
		Triangulo t = new Triangulo();
		Lapis l2 = new Lapis(t);
		l2.desenha();
		
	}

}
