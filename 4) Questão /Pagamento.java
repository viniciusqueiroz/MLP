package mlp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pagamento {
	private String entrada;

	public Pagamento(String entrada){
		this.entrada = entrada;
	}
	public int salario(){
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(this.entrada);
		int soma = 0;
		while(matcher.find()){
			String i = matcher.group();
			soma += Integer.parseInt(i);
			
		}
	return soma;	
	}
}
