# PythonSteps
O projeto PythonSteps é uma Gamificação Educacional da Disciplina de Lógica de Programação, que aborda a linguagem Python, portanto que visa o aprendizado e o treino desta linguagem de uma forma mais dinâmica, além de proporcionar ao Professor um acompanhamento do desenvolvimento dos alunos com possível gerenciamento das questões presentes no jogo.


## Instalação e Requerimentos:
     
     PythonSteps.jar:

     Java (versão mais recente)


- com o Java e o PythonSteps.jar instalados, basta clicar duas vezes no PythonSteps.jar para rodar o PythonSteps

## Tutorial PythonSteps:
O jogo irá iniciar na Página de Login, portanto se você já tiver um login basta inserir seu Registro de Usuário e Senha cadastrados, porém se ainda não tiver cadastro deve selecionar o botão "Cadastrar"

Na página de cadastro, as seguintes considerações devem ser levadas em conta:

- para Aluno: no Registro do Usuário deve inserir o RA completo, números com ponto e traço
- para Professores: no Registro de Usuário e na senha deve informar "admin" no início de ambos, por exemplo: adminAmanda, senha: admin123

### Página Principal: ##
#
Após realizar o login, o usuário será direcionado para sua Página Principal (HomePage) de acordo com o seu tipo de usuário.

- Aluno: poder iniciar o jogo, acessar a seus resultados e consultar as regras. 

- Professor: além de jogar e ver as regras, assim como o aluno, os usuários cadastrados nesse tipo possuem acesso aos resultados de todos os usuários, os resultados gerais, e podem gerenciar as questões presentes no jogo.


### Jogar: ##
#
O jogo consiste em um quiz de 5 perguntas sorteadas de forma aleatória, que são separadas por categorias e por níveis de dificuldade com suas respectivas pontuações (1, 2 e 3). 
- As categorias são:
    - selecione a saída:  
        a questão consiste em um código e o jogador deve selecionar o que o código irá retornar
    - complete o código:  
        a questão é formada por uma instrução e em seguida por um código que possui uma lacuna, assim o jogador deverá selecionar a alternativa que contém o trecho do código que o completa
    - função do comando:  
        a questão cita um comando da linguagem Python e o jogador deve selecionar a alternativa que possui a explicação correta para aquele comando 
    - erro no código:  
        a questão contém um código que possui algum erro, portanto o jogador deve selecionar a alternativa que cita o erro e o explica

Após responder as 5 questões, as páginas de feedback para cada uma delas serão exibidas, com a pontuação total do jogador de acordo com seu desempenho. Essas páginas de feedback possuem o enunciado, as alternativas, a alternativa correta, seu peso (1 , 2 ou 3) e uma breve explicação do porquê da resposta. 

### Regras do PythonSteps
#
- só é possível passar para o próxima questão após selecionar uma alternativa e terá apenas uma chance para respondê-la
- quando o jogo iniciar todas as perguntas devem ser respondidas para que seja gerado um feedback para todas as perguntas ao encerrar
- não é possível escolher a categoria desejada, ela será sorteada aleatoriamente, assim como as questões
- existe apenas uma alternativa correta para cada questão, portanto , só poderá selecionar uma opção de resposta
- após ter respondido a questão, selecionar a opção "Seguinte" para avançar para a próxima
- se desejar fechar a partida deve clicar no botão "LogOut"

### Gerenciar Questões ##
#
A principal função atribuida excluisvamente para os usuários cadastrados como Professor é o gerenciamento das questões, podendo consultá-las, alterá-las, deletá-las e criar perguntas novas para adicionar ao jogo. Essa utilidade pode ser acessada na Página Principal (HomePage).
- criar questão: deve obrigatoriamente inserir todos os campos e selecionar a alternativa correta, nível de dificuldade e qual categoria tal questão irá pertencer 

- consultar questão: na Página de Consulta é exibida uma tabela com os enunciadados das questões, suas categorias e níveis de dificuldade (estão ordenadas por categorias e níveis), assim se o Professor desejar ver tudo que a questão possui basta clicar nela que a mesma será exibida uma tela menor 

- alterar ou deletar: ao selecionar uma questão específica da tabela exibida na Página de Consulta, o usuário pode fazer as alterações que deseja na mesma e alterá-la ou apenas deletá-la, clicando nos botões indicados, e após fazer qualquer uma das duas alterações é necessário clicar no botão de "atualizar" localizado na canto superior esquerdo da página para exibir a tabela de questões atualizada 

### Ver Resultados
#

Os usários cadastrados como Aluno possuem acesso apenas aos seus reusltados, aonde é exibido sem nome, seu RA e suas pontuações em cada jogo que realizou.

Já os usuários cadastrados como Professor, podem ver os resultados gerais, de todos os usuários, a partir de um tabela que contém o nome, registro de usuário e pontuação de cada um.  

Porém para facilitar a consulta do professor, é possível buscar pelo Registro de Usuário apenas os resultados de determinado Aluno ou até mesmo Professor, portanto para filtrar é preciso digitar no espaço indicado no canto superior direito e clicar no botão com ícone de lupa para realizar pesquisa. Após essa consulta específica se desejar voltar para a tabela complet basta clicar no botão "atualizar" no canto superior esquerdo.


### LogOut
#

Em todas as páginas do jogo, exceto a das questões, é possível fazer logOut para sair, assim será direcionado para a página de Login.