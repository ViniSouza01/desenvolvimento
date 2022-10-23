package pesquisa;

public class Pessoa {
	String nomes;
	String sobrenome;
	int idade;
	
	Pessoa(){}
	Pessoa(String n, String sob, int age){
		nomes = n;
		sobrenome = sob;
		idade = age;
	}
	
	
	public String faseDaVida() {
		if(idade <= 13)
			return "Crianca";
		else if(idade <= 20)
			return "Jovem";
		else if(idade <=59)
			return "Adulto";
		else return "Idoso";
	}
	public String toString() {
		return String.format("%s      \t      %s      \t      %d      \t      %s",nomes, sobrenome, idade, faseDaVida());
	}
}
