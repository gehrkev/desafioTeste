# Gerenciador de Evento
## Desafio de programação

   - Autor - Vitor André Gehrke
   - Versão - 1.0
   - Programa - desafioProgramacao
   - Agradecimentos aos professores Geraldo Menegazzo Varela - UDESC/Ibirama - SC e Nelio Alves - UFU (Curso Udemy _Java COMPLETO Programação Orientada a Objetos +Projetos_)

  ### ESCOPO

   **Este programa foi desenvolvido como uma solução para um desafio de programação.**
   O desafio apresenta o problema seguinte:

   "Uma empresa vai realizar um treinamento para uma grande empresa de TI de uma cidade brasileira, especializada em softwares de gestão. 
   O treinamento será realizado em 2 etapas e as pessoas serão divididas em salas com lotação variável. 
   Serão realizados também dois intervalos de café em 2 espaços distintos. 
   Você precisa criar o sistema que gerenciará este evento.
   
   ### O sistema precisa permitir:
   - O cadastro de pessoas, com nome e sobrenome;
   - O cadastro das salas do evento, com nome e lotação;
   - O cadastro dos espaços de café pelo nome;
   
   A diferença de pessoas em cada sala deverá ser de no máximo 1 pessoa. Para estimular a troca de
   conhecimentos, metade das pessoas precisam trocar de sala entre as duas etapas do treinamento.
   Ao consultar uma pessoa cadastrada no treinamento, o sistema deverá retornar à sala em que a
   pessoa ficará em cada etapa e o espaço onde ela realizará cada intervalo de café.
   Ao consultar uma sala cadastrada ou um espaço de café, o sistema deverá retornar uma lista das
   pessoas que estarão naquela sala ou espaço em cada etapa do evento.
   Requisitos obrigatórios:
   
   #### Crie uma interface que permita:
   
   - O cadastro de pessoas, com nome e sobrenome;
   - O cadastro das salas do evento, com nome e lotação; 
   - O cadastro dos espaços de café com lotação;
   - A consulta de cada pessoa;
   - A consulta de cada sala e espaço;
   
   ##### Requisitos desejáveis:
    
   - Persistência de dados;
   - Testes unitários;"

   **A versão atual do programa atende apenas os requisitos obrigatórios, não havendo persistência de dados nem testes unitários.**

   O programa foi desenvolvido em: 

   - Java 11 - OpenJDK
   - Eclipse IDE for Java Developers Version: 2019-12 (4.14.0); Build id: 20191212-1212
   - Sistema Operacional Manjaro Linux 5.4.97-1-MANJARO

   ### COMPILANDO E RODANDO O PROGRAMA

   Requisitos: Java 11 OpenJDK e Eclipse IDE for Java Developers

   1. Copie a URI HTTPS do programa no GitHub (https://github.com/gehrkev/desafioTeste.git)
   2. No Eclipse, vá em File -> Import... -> Selecione Git -> Projects from Git -> Next ->  Em "Select Repository Source" selecione Clone URI -> Next -> 
   3. Em "Source Git Repository" cole a URI no campo URI -> Next -> Selecione o Branch Main -> Next -> Configure as opções de destinação e diretório -> 
   4. Em "Select a wizard to use for importing projects" selecione a opção "New Project Wizard" -> Finish -> Selecione o wizard "Java -> Java Project" ->
   5. Next -> Desabilite a opção "Use default location" e selecione ("Browse...") a localização de onde o repositório Git foi clonado 
        (Criado no passo 3 - exemplo "/home/seuUsuario/git/desafioTeste/") -> Finish -> Em "New module-info.java" selecione a opção "Don't create"
   6. Em File -> Export... -> Java - Runnable JAR file -> Em "Launch configuration" escolha o projeto importado -> Em "Export destination" escolha onde gerar o arquivo .jar -> 
        Finish -> Ok
   7. No terminal/prompt de comando, digite "java -jar /localizacao/do/arquivo/jar/criado.jar" (Sem aspas)
        Exemplo:  java -jar /home/User/desafioProgramacao.jar
        O programa deverá rodar se você tiver o OpenJDK 11 instalado
    
   ### INSTRUÇÕES

   Siga as instruções como pedido no console. Ex:

    Informe nome da sala 1: 
    Força
    Informe a lotação da sala 1: 
    3
    Informe nome da sala 2: 
    Terra
    Informe a lotação da sala 2: 
    3
    Informe o nome do espaço-café 1: 
    SBux
    Informe o nome do espaço-café 2: 
    DDonutz
    Informe o nome completo do participante: 
    João Silva
    Informe o nome completo do participante: 
    Maria Santos
    Informe o nome completo do participante: 
    Isaac Newton
    Informe o nome completo do participante: 
    Albert Einstein
    Informe o nome completo do participante: 
    Marco Aurélio
    Informe o nome completo do participante: 
    Napoleão Bonaparte

   Após cadastrar o nome e lotação das salas e o nome dos espaços-café usados na primeira etapa do treinamento, além do nome completo dos participantes, 
    o programa automaticamente irá organizar as salas e espaços-café para a segunda etapa.
    Então siga novamente as instruções em tela:
    
   Escolha uma opção:

    1 - Consultar salas de eventos
    2 - Consultar espaços-café
    3 - Pesquisar participante
    0 - Sair


