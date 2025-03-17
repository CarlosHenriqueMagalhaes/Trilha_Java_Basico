Nós precisaremos entrar na pasta do Jetty e rodar java -jar start.jar na linha de comando, chamando a máquina virtual e passando esse .jar.

Através do "Prompt de Comando", vamos acessar a pasta "jetty-distribution-9.4.12.v20180830" (na qual instalamos o jetty). Com o comando dir, poderemos ver todo o conteúdo da pasta, incluindo o start.jar que precisamos rodar. Faremos isso executando java -jar start.jar.

Dica: Pode ser necessário adicionar o Java às permissões de Firewall do seu computador.

O prompt irá executar o .jar, subindo o servidor. Ainda não sabemos para qual diretório o Jetty extraiu nossa aplicação, mas já podemos testá-la acessando http://localhost:8080/. O navegador retornará um "Error 404 - Not Found", mas esse erro será mostrado pelo Jetty.

Além disso, o navegador irá mostrar que o Jetty carregou um contexto:

/gerenciador ---> o.e.j.w.WebAppContext@7ce69770{gerenciador,/gerenciador,file:///C:/Users/rodrigo/AppData/Local/Temp/jetty-0.0.0.0-8080-gerenciador.war-_gerenciador-any-6453341044811316924.dir/webapp/,UNAVAILABLE}{C:\Users\rodrigo\Desktop\outrogerenciador\jetty-distribution-9.4.12.v20180830\webapps\gerenciador.war}Copiar código
Ou seja, nosso gerenciador está rodando. Portanto, em teoria, será possível acessar http://localhost:8080/gerenciador/entrada?acao=ListaEmpresas. Quando fizermos isso, seremos redirecionados para LoginForm, e poderemos fazer o login normalmente.

Pronto! Estamos rodando nossa plataforma com outro Servlet Container.

Em teoria, isso também significa que o nosso cliente do WebService também continua funcionando. Para testarmos isso, basta rodarmos o cliente no Eclipse. Nesse caso, tanto a requisição com o cabeçalho JSON quanto com XML funcionarão normalmente. Inclusive, as nossas saídas dos filtros serão mostradas no "Prompt de Comando".

Conseguimos deployar nossa aplicação no Jetty e no Tomcat, e poderíamos até mesmo fazer isso no Wildfly, pois ele também atende o mundo Servlet. Falaremos mais sobre isso no próximo vídeo. Até lá!