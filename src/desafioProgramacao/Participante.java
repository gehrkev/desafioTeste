package desafioProgramacao;

public class Participante {
	private String nome;
	
	public Participante(){
		nome = "";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return "Nome: " + getNome() + "\n";
	}

}
