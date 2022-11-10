package aplicacoes;

public class Vacina {
	private String nomePet;
	private String veterinario;
	private String nomeVacina;
	private String data;

	public Vacina() {
	}

	public Vacina(String nomePet, String veterinario, String nomeVacina, String data) {
		this.nomePet = nomePet;
		this.veterinario = veterinario;
		this.nomeVacina = nomeVacina;
		this.data = data;
	}

	public String toString() {
		return String.format("%s \t\t%s \t\t%s \t\t%s", nomePet, veterinario, nomeVacina, data);
	}

	public String getNomePet(String pesquisa) {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;

	}
}
