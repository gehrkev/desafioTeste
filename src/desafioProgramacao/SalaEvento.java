package desafioProgramacao;

public class SalaEvento {
	private String nome;
	private int lotacao;
	private Participante[] oParticipante;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTamanhoVetor(){
		return oParticipante.length;
	}
	
	public void criarVetorLotacaoParticipantes(int tamanho){
		if (tamanho > 0)
			oParticipante = new Participante[tamanho];
	}
	public int getLotacao() {
		return lotacao;
	}
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
		
	public void setParticipante(Participante oPessoa, int local){
		if (oPessoa != null){
			this.oParticipante[local] = oPessoa;
		}
		else
			System.out.println("PESSOA = NULL.....");
	}
	
	public void setParticipanteEtapa2(Participante oPessoa, int local, SalaEvento oSala){
		if (oPessoa != null){
			this.oParticipante[local] = oPessoa;
		}
		else
			System.out.println("PESSOA = NULL.....");
	}
	
	public String getParticipante(String nome, int i){
		return oParticipante[i].getNome();
	}
	
	public Participante getParticipante(int i){
		return oParticipante[i]; 
	}

	public String toString(){
		
		String lista = "Espaço Evento: " + nome + "\n";
		for (int i = 0; i < this.getLotacao(); i++){
			if (oParticipante[i] != null)
				lista += oParticipante[i].toString() + "\n";				
			else		
				System.out.println("PESSOA = NULL.....");			
		}
		
		return lista;
	}
	
}
