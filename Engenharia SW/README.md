# Bertoti

### 1) Comentários do livro Software Engineering at Google
"The great thing about tech is that there is never only one way to do something. Instead, there is a series of trade-offs we all must make depending on the circumstances of our team and situation. What can we cheaply take from open source? What can our team build? What makes sense to support for our scale?"

"An early attempt to define software engineering produced a good definition for this viewpoint: 'The multiperson development of multiversion programs.' This suggests the difference between software engineering and programming is one of both time and people. Team collaboration presents new problems, but also provides more potential to produce valuable systems than any single programmer could."

### 2) Três exemplos de trade-offs
- Portabilidade X Simplicidade:
  - Um exemplo de software que envolve o tema Portabilidade x Simplicidade é o Java, uma linguagem de programação orientada a objetos que permite o desenvolvimento de aplicações para diversas plataformas, como Windows, Linux, Mac OS, Android, entre outras. O Java oferece uma vantagem de portabilidade, pois basta compilar a aplicação uma vez apenas para que essa possa ser executada em qualquer plataforma que possua a respectiva máquina virtual Java (também conhecida por JVM). Isso evita a necessidade de reescrever o código para cada sistema operacional diferente, reduzindo o tempo e o custo de desenvolvimento.
  Por outro lado, o Java também apresenta alguns desafios de simplicidade, pois é uma linguagem que exige uma sintaxe rigorosa, que pode ser confusa ou verbosa para iniciantes ou programadores acostumados com outras linguagens. Além disso, o Java possui muitos recursos e bibliotecas, que podem aumentar a complexidade e a dificuldade de aprendizado e manutenção do código. O Java também pode ter problemas de performance, pois depende da JVM para interpretar o código em tempo de execução, o que pode tornar a aplicação mais lenta ou consumir mais recursos do que outras linguagens compiladas.
  
  
- Usabilidade X Segurança:
  - Um exemplo de software que envolve o tema Usabilidade x Segurança é o WhatsApp, um aplicativo de mensagens instantâneas que possui mais de 2 bilhões de usuários no mundo. O WhatsApp oferece uma interface simples e intuitiva, que permite aos usuários enviar e receber mensagens de texto, voz, vídeo, imagens, documentos e localização, além de realizar chamadas de voz e vídeo. O aplicativo também possui recursos como grupos, listas de transmissão, status, stickers e emojis, que tornam a comunicação mais divertida e expressiva.
  Por outro lado, o WhatsApp também se preocupa com a segurança das informações dos usuários, utilizando a criptografia de ponta a ponta em todas as comunicações. Isso significa que somente o remetente e o destinatário podem ler ou ouvir as mensagens e chamadas trocadas, sem que ninguém mais, nem mesmo o próprio WhatsApp, possa acessá-las. O aplicativo também permite que os usuários verifiquem a autenticidade das chaves de criptografia de seus contatos, bloqueiem o acesso ao aplicativo com impressão digital ou reconhecimento facial, e ativem a confirmação em duas etapas para proteger sua conta.
  
- Escalabilidade X Complexidade:
  - Um exemplo de software que envolve o tema Escalabilidade x Complexidade é o Netflix, um serviço de streaming de filmes e séries que possui mais de 200 milhões de assinantes no mundo. O Netflix oferece uma experiência personalizada para cada usuário, que pode assistir a conteúdos de alta qualidade em diversos dispositivos, como TVs, computadores, smartphones e tablets. O serviço também permite que os usuários baixem alguns títulos para assistir offline, além de ter recursos como perfis, listas, recomendações e legendas.
  Por outro lado, o Netflix também enfrenta desafios de escalabilidade e complexidade, pois precisa lidar com uma enorme quantidade de dados e tráfego, que variam de acordo com a região, o horário e a demanda dos usuários. O serviço precisa garantir que os conteúdos sejam entregues com rapidez, qualidade e segurança, sem interrupções ou atrasos.

### 3) Requisito não funcional de usabilidade - avaliar 10 heurísticas
- ### 1 – Visibilidade do Status do sistema
  Quando assistimos a uma playlist no YouTube, somos informados de tudo que ocorre na tela, como a barra do player que mostra o quanto do vídeo já foi carregado, em qual parte o vídeo está, o tempo de duração dele, o quanto já foi assistido, do lado direito fica claro qual vídeo está sendo reproduzido, quais já foram assistidos e quais os próximos.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/cfbb95b3-2444-463d-82e4-946eb6099885" alt="Heuristica 1" style="width:700px;height:300px;"></p>

- ### 2 – Correspondência entre o sistema e o mundo real
  Utilize metáforas da vida real nas interfaces, como o Windows faz ao utilizar o ícone de lixeira que remete a uma lixeira real, deixando a compreensão mais fácil ao usuário.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/b84e7e24-5112-4738-b38d-1a2cfe354894" alt="Heuristica 2" style="width:700px;height:300px;"></p>
  
- ### 3 – Controle e liberdade para o usuário
  O Gmail permite que o usuário desfaça a ação de excluir um e-mail, portanto a caixa com a opção “desfazer” permite que o usuário se recupere, dando a ele controle sobre a situação, caso ela tenha sido realizada por engano.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/3e466f56-1777-478a-8bff-554b22828ebc" alt="Heuristica 3" style="width:700px;height:300px;"></p>

- ### 4 – Consistência e padronização
  Os programas da Microsoft seguem padrões, sendo que os itens do menu ficam sempre na parte superior, os ícones que realizam a mesma ação são repetidos em todas as interfaces.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/1d39c381-e58a-4abf-a599-c96f95a7d62d" alt="Heuristica 4" style="width:700px;height:300px;"></p>

- ### 5 – Prevenção de erros
  O Windows mostra uma caixa de confirmação quando o usuário envia algum arquivo para a lixeira.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/60e81589-88c1-4e98-8efb-35542e289825" alt="Heuristica 5" style="width:700px;height:300px;"></p>

- ### 6 – Reconhecimento em vez de recordação
  O Mercado livre deixa os filtros aplicados viseis para o usuário durante o tempo inteiro.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/b5f989e5-f2ae-4251-a013-af74efdbb2a1" alt="Heuristica 6" style="width:700px;height:300px;"></p>

- ### 7 – Eficiência e flexibilidade de uso
  Os atalhos de teclado do Windows permitem uma interação mais rápida, pois reduzem a quantidade de cliques que o usuário precisaria para realizar uma ação, além de diminuir o tempo gasto para achar onde aquela ação está na plataforma, permitindo realizá-la apertando poucas teclas.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/ee9e1587-a020-4a6b-9316-5d6b2ab19592" alt="Heuristica 7" style="width:700px;height:300px;"></p>

- ### 8 – Estética e design minimalista
  O site da Apple é um bom exemplo de estética e design minimalista, ele é bem simples e objetivo, mostrando o nome do produto, uma linha o descrevendo e a foto dele grande e destacada com cores contrastantes, além disso o site valoriza o espaço em branco, os elementos são bem organizados e a tipografia usada é simples e limpa.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/b2d90017-00b5-4aac-8f11-cbf4543358ad" alt="Heuristica 8" style="width:700px;height:300px;"></p>

- ### 9 – Ajude os usuários a reconhecer, diagnosticar e recuperar erros
  Ao fazer login em um site mostrar quando um dado está preenchido incorretamente, orientando como recupera-lo.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/2a61a72c-c7f9-4ac4-96c4-4668f516743f" alt="Heuristica 9" style="width:700px;height:300px;"></p>

- ### 10 – Ajuda e documentação
  O site da Saraiva possui um FAQ que permite aos usuários verem as dúvidas mais frequentes e suas respectivas soluções, podendo assim resolver por conta um problema que esteja aqui.
  <p><img src="https://github.com/VonNexx/bertoti/assets/111203231/f3a24e38-244d-4d8d-b0f5-70659d3bf8cb" alt="Heuristica 10" style="width:700px;height:300px;"></p>

### 4) Diagrama de Casos de Uso
<p><img src="https://github.com/VonNexx/bertoti/assets/111203231/cb657179-4ff1-4d98-aa21-917c84a5513b" alt="Diagrama Casos de Uso" style="width:700px;height:300px;"></p>

### 5) Diagrama de Classes UML
<p><img src="https://github.com/VonNexx/bertoti/assets/111203231/eb974b0d-e46b-46e8-a632-7788617069d8" alt="Diagrama Classes UML" style="width:700px;height:300px;"></p>
