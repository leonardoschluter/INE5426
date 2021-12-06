#Trabalho de compiladores ( INE5426 )
## Analisador léxico da linguagem LCC-2021-2

Realizado por Leonardo Schlüter Leite - 13200658
## Estrutura do código

Como utilizei o ANTLR-4, precisei descrever a gramática num arquivo .g4  que está localizado em `src/main/antlr4/CC_2021_2.g4`.


Após, utilizei o plugin do ANTLR-4 do maven para gerar os arquivos que estão localizados em `src/main/java/org/schluter/compiler/gen`. 
Detalhe aqui é que tive que alterar o arquivo `CC_2021_2Lexer.java` para modificar a ação tomada pelo analizador ao encontrar com o token do tipo Invalid.


Por fim, criei uma classe App que contém o método main e utiliza dos arquivos gerados para fazer a análise léxica.

## Para compilar    

Detalhe, já estou enviando com o .jar compilado para casa haja problema ao instalar o maven ou utilizá-lo, ai basta seguir para a seção "Para Rodar".

1. Primeiro precisamos de um terminal com java
2. Precisamos do maven instalado e exportado no Path
   1. Para instalar, basta seguir a [documentação](https://maven.apache.org/install.html)
   2. Para verificar, rodar mvn -v
3. Então basta rodar `make all` e estará compilado

Existe o comando `make clean` para limpar a pasta target.

## Para rodar
 
O próprio `make all` diz o que fazer, mas segue: 

Para Executar basta rodar: 

`java -jar target/compiler-1.0-jar-with-dependecies.jar /caminho/absoluto/para/seu/arquivo.lcc`

Detalhe, funciona com caminho relativo também, Ex: `"./codigosLCC/codigo1.lcc"`
## Arquivos exemplos
Como requisitado no enunciado do trabalho, existem 3 arquvios de codigo LCC-2021-2
com extensão .lcc; 

Os mesmos estão localizados na pasta `codigosLCC`.

