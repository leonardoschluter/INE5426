all:
	( mvn clean compile assembly:single);
	( echo " \n \n \n O compilado está na pasta target criada aqui \n ./target/compiler-1.0-jar-with-dependecies.jar \n Para Executar basta rodar:\n		java -jar target/compiler-1.0-jar-with-dependecies.jar /caminho/absoluto/para/seu/arquivo.lcc");
clean :
	(mvn clean)