package desafioProgramacao;

import java.util.Scanner;

public class MenuPrincipal {

	private Participante[] oParticipante;

	private SalaEvento oSala1_etapa_1;
	private SalaEvento oSala2_etapa_1;
	private SalaEvento oSala1_etapa_2;
	private SalaEvento oSala2_etapa_2;

	private EspacoCafe oEspacoCafe1;
	private EspacoCafe oEspacoCafe2;

	private void criarObjetos() {

		oSala1_etapa_1 = new SalaEvento();
		oSala2_etapa_1 = new SalaEvento();
		oSala1_etapa_2 = new SalaEvento();
		oSala2_etapa_2 = new SalaEvento();

		oEspacoCafe1 = new EspacoCafe();
		oEspacoCafe2 = new EspacoCafe();
	}

	private void criarVetorPessoas() {
		oParticipante = new Participante[this.oSala1_etapa_1.getLotacao()];
	}

	private void cadastrarSalaEventos() {
		for (int i = 0; i < 2; i++) {
			Scanner scanner = new Scanner(System.in);

			if (i == 0) {
				System.out.println("Informe nome da sala 1: ");
				oSala1_etapa_1.setNome(scanner.nextLine());
				System.out.println("Informe a lotação da sala 1: ");
				oSala1_etapa_1.setLotacao(scanner.nextInt());
			} else {
				System.out.println("Informe nome da sala 2: ");
				oSala2_etapa_1.setNome(scanner.nextLine());
				System.out.println("Informe a lotação da sala 2: ");
				oSala2_etapa_1.setLotacao(scanner.nextInt());
			}
		}
		oSala1_etapa_1.criarVetorLotacaoParticipantes(oSala1_etapa_1.getLotacao());
		oSala2_etapa_1.criarVetorLotacaoParticipantes(oSala2_etapa_1.getLotacao());

		oSala1_etapa_2.criarVetorLotacaoParticipantes(oSala1_etapa_1.getLotacao());
		oSala2_etapa_2.criarVetorLotacaoParticipantes(oSala2_etapa_1.getLotacao());

		oEspacoCafe1.criarVetorParticipantesEspacoCafe(oSala1_etapa_1.getLotacao());
		oEspacoCafe2.criarVetorParticipantesEspacoCafe(oSala2_etapa_1.getLotacao());
	}

	private void cadastrarSalaCafe() {
		for (int i = 0; i < 2; i++) {
			Scanner scanner = new Scanner(System.in);
			if (i == 0) {
				System.out.println("Informe o nome do espaço-café 1: ");
				oEspacoCafe1.setNome(scanner.nextLine());
			} else {
				System.out.println("Informe o nome do espaço-café 2: ");
				oEspacoCafe2.setNome(scanner.nextLine());
			}
		}
	}

	private void cadastrarParticipantes() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < oSala1_etapa_1.getLotacao(); i++)
			for (int j = 0; j < 2; j++) {
				Participante oPessoa = new Participante();
				System.out.println("Informe o nome completo do participante: ");
				oPessoa.setNome(scanner.nextLine());
				criarVetorPessoas();
				oParticipante[i] = oPessoa;
				if (j == 0) {
					oSala1_etapa_1.setParticipante(oPessoa, i);
					oEspacoCafe1.setParticipante(oPessoa, i);
				} else {
					oSala2_etapa_1.setParticipante(oPessoa, i);
					oEspacoCafe2.setParticipante(oPessoa, i);
				}
			}
	}

	public void listarSala1() {
		System.out.println("Listando sala " + oSala1_etapa_1.getNome() + "\n ");
		System.out.println("Etapa 1: ");
		System.out.println(oSala1_etapa_1.toString());
		System.out.println("Etapa 2: ");
		System.out.println(oSala1_etapa_2.toString());
		System.out.println("Fim da listagem da sala " + oSala1_etapa_1.getNome() + "\n");

	}

	public void listarSala2() {
		System.out.println("Listando sala " + oSala2_etapa_1.getNome() + "\n ");
		System.out.println("Etapa 1: ");
		System.out.println(oSala2_etapa_1.toString());
		System.out.println("Etapa 2: ");
		System.out.println(oSala2_etapa_2.toString());
		System.out.println("Fim da listagem da sala " + oSala2_etapa_1.getNome() + "\n");
	}

	public void consultaSala() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sala desejada a consultar:\n");
		System.out.println("1 - " + oSala1_etapa_1.getNome());
		System.out.println("2 - " + oSala2_etapa_1.getNome());
		int consulta = scanner.nextInt();
		switch (consulta) {
		case 1:
			listarSala1();
			break;
		case 2:
			listarSala2();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

	public void listarEspacoCafe1() {
		System.out.println("Listando espaço-café " + oEspacoCafe1.getNome() + "\n");
		System.out.println(oEspacoCafe1.toString());
		System.out.println("Fim da listagem do espaço café\n");
	}

	public void listarEspacoCafe2() {
		System.out.println("Listando espaço-café " + oEspacoCafe2.getNome() + "\n");
		System.out.println(oEspacoCafe2.toString());
		System.out.println("Fim da listagem do espaço café\n");
	}

	public void consultaCafe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o espaço-café desejado a consultar:\n");
		System.out.println("1 - " + oEspacoCafe1.getNome());
		System.out.println("2 - " + oEspacoCafe2.getNome());
		int consulta = scanner.nextInt();
		switch (consulta) {
		case 1:
			listarEspacoCafe1();
			break;
		case 2:
			listarEspacoCafe2();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

	public void pesquisarParticipante() {
		boolean achou = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nPESQUISAR PARTICIPANTE");
		System.out.println("Informe o nome completo do participante: ");
		String participante = scanner.nextLine();
		for (int i = 0; i < oSala1_etapa_1.getLotacao(); i++) {
			String nomeEtapa1 = oSala1_etapa_1.getParticipante(participante, i);
			if (participante.equalsIgnoreCase(nomeEtapa1)) {
				System.out.println(nomeEtapa1 + " está na sala " + oSala1_etapa_1.getNome() + " na etapa 1.");
				achou = true;
			} else {
				nomeEtapa1 = oSala2_etapa_1.getParticipante(participante, i);
				if (participante.equalsIgnoreCase(nomeEtapa1)) {
					System.out.println(nomeEtapa1 + " está na sala " + oSala2_etapa_1.getNome() + " na etapa 1. ");
					achou = true;
				}
			}
		}
		for (int j = 0; j < oSala1_etapa_2.getLotacao(); j++) {
			String nomeEtapa2 = oSala1_etapa_2.getParticipante(participante, j);
			if (participante.equalsIgnoreCase(nomeEtapa2)) {
				System.out.println(nomeEtapa2 + " está na sala " + oSala1_etapa_2.getNome() + " na etapa 2. ");
				achou = true;
			} else {
				nomeEtapa2 = oSala2_etapa_2.getParticipante(participante, j);
				if (participante.equalsIgnoreCase(nomeEtapa2)) {
					System.out.println(nomeEtapa2 + " está na sala " + oSala2_etapa_2.getNome() + " na etapa 2. ");
					achou = true;
				}
			}
		}
		for (int k = 0; k < oSala1_etapa_1.getLotacao(); k++) {
			String nomeCafe = oEspacoCafe1.getParticipante(participante, k);
			if (participante.equalsIgnoreCase(nomeCafe)) {
				System.out.println(
						"Os intervalos 1 e 2 de " + nomeCafe + " serão no espaço: " + oEspacoCafe1.getNome() + "\n");
				achou = true;
			} else {
				nomeCafe = oEspacoCafe2.getParticipante(participante, k);
				if (participante.equalsIgnoreCase(nomeCafe)) {
					System.out.println("Os intervalos para café 1 e 2 de " + nomeCafe + " serão no espaço: "
							+ oEspacoCafe2.getNome() + "\n");
					achou = true;
				}
			}
		}

		if (!achou)
			System.out.println("Participante não encontrado");
	}

	private void organizarParticipantesEtapa2() {

		System.out.println("\n=======================================\nORGANIZANDO SALAS PARA ETAPA 2");
		Participante oParticipante;

		oSala1_etapa_2.setNome(oSala1_etapa_1.getNome());
		oSala1_etapa_2.setLotacao(oSala1_etapa_1.getLotacao());
		oSala2_etapa_2.setNome(oSala2_etapa_1.getNome());
		oSala2_etapa_2.setLotacao(oSala1_etapa_1.getLotacao());

		for (int i = 0; i < oSala1_etapa_2.getLotacao(); i++) {
			if ((i % 2) == 0) {
				oParticipante = new Participante();
				oParticipante = oSala1_etapa_1.getParticipante(i);
				oSala1_etapa_2.setParticipanteEtapa2(oParticipante, i, oSala1_etapa_2);

				oParticipante = new Participante();
				oParticipante = oSala2_etapa_1.getParticipante(i);
				oSala2_etapa_2.setParticipanteEtapa2(oParticipante, i, oSala2_etapa_2);
			} else {
				oParticipante = new Participante();
				oParticipante = oSala2_etapa_1.getParticipante(i);

				if (oParticipante != null) {
					oSala1_etapa_2.setParticipanteEtapa2(oParticipante, i, oSala1_etapa_2);
				}

				oParticipante = new Participante();
				oParticipante = oSala1_etapa_1.getParticipante(i);
				if (oParticipante != null) {
					oSala2_etapa_2.setParticipanteEtapa2(oParticipante, i, oSala2_etapa_2);
				}
			}

		}

		System.out.println("Etapa 2 foi organizada.\n=======================================\n");

	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		criarObjetos();
		System.out.println("REGISTRO DE PARTICIPANTES - ETAPA 1");
		cadastrarSalaEventos();
		cadastrarSalaCafe();
		cadastrarParticipantes();
		organizarParticipantesEtapa2();

		do {
			System.out.println(
					"Escolha uma opção:\n\n1 - Consultar salas de eventos\n2 - Consultar espaços-café\n3 - Pesquisar participante\n0 - Sair");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				consultaSala();
				break;
			case 2:
				consultaCafe();
				break;
			case 3:
				pesquisarParticipante();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida.");
				break;

			}

		} while (opcao != 0);

		System.out.println("\nDesafio implementado por Vitor André Gehrke \n"
				+ "Acadêmico do Curso de Ciência da Computação \n" + "UDESC/JOINVILLE");

		System.out.println("DIGITE QUALQUER TECLA E APERTE ENTER PARA FINALIZAR \n");
		scanner.next();
	}

}
