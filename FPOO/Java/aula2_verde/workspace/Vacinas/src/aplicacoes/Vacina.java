package aplicacoes;


public class Vacina {
	 String nomePet;
	 String veterinario;
	 String nomeVacina;
	 String data;
	
	public Vacina() {}
	 public Vacina(String nomePet, String veterinario, String nomeVacina, String data) {
		this.nomePet = nomePet;
		this.veterinario = veterinario;
		this.nomeVacina = nomeVacina;
		this.data = data;
	}
	 
	 public String toString() {
		 return String.format("%s \t\t%s \t\t%s \t\t%s",nomePet, veterinario, nomeVacina, data);
	 }
}
