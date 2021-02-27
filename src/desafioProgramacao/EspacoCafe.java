package desafioProgramacao;

public class EspacoCafe {

	private String nome;
	private Participante[] oParticipante;
	
	public EspacoCafe() {
		nome = "";	
	}

	public void criarVetorParticipantesEspacoCafe(int tamanho) {
		oParticipante = new Participante[tamanho];
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Participante[] getParticipante() {
		return oParticipante;
	}

	public void setParticipante(Participante oPessoa, int local) {
		if (oPessoa != null)
			this.oParticipante[local] = oPessoa;
	}
	
	public Participante getParticipante(int i){
		return oParticipante[i]; 
	}
	
	public String getParticipante(String nome, int i){
		return oParticipante[i].getNome();
	}
	
	public String toString(){
		String listaParticipantes = "Espaço Café: " + nome + "\n";
		for (int i = 0; i < oParticipante.length; i++){
			listaParticipantes += oParticipante[i].toString() + " " + 
				"\n";
		}
		
		return listaParticipantes;
	}
}
