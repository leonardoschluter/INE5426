package org.schluter.compiler;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.schluter.compiler.gen.CC_2021_2Lexer;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static String readFileAsString(String fileName)  {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao analisador léxico da CC-2021-2 \n" +
                "\n** Aluno: Leonardo Schlüter Leite - 13200658 **\n\n" +
                "Atenção: este programa irá parar caso algum caminho não seja identificado nos argumentos de chamada\n" +
                "formato esperado: /caminho/absoluto/para/seu/arquivo");

        if (args.length == 0 || args[0].isEmpty()) {
            System.out.println(" Como avisado, encerrando o programa");
            System.exit(-1);
        }

        String fileContent = readFileAsString(args[0]);

        CC_2021_2Lexer cc_2021_2Lexer = new CC_2021_2Lexer(CharStreams.fromString(fileContent));
        List<Token> tokens = (List<Token>) cc_2021_2Lexer.getAllTokens();

        if(cc_2021_2Lexer.errors.size() > 0) {
            System.out.println("Acabou o processamento do input, segue os erros encontrados:");
            cc_2021_2Lexer.errors.forEach(it -> System.out.println(it));
        }else{
            System.out.println("Acabou o processamento do input, segue os tokens encontrados:");
            tokens.forEach(token -> {
                // Ignora tokens do hidden Channel
                // por hora apenas a regra WhiteSpace
                if (token.getChannel() != Token.HIDDEN_CHANNEL) {
                    System.out.println("Linha:"+ token.getLine() +" - Índice:"+ token.getCharPositionInLine() +" -  token_text:"+token.getText());
                }
            });
        }

        /*
            Codigo comentado pois será utilizado no Analisador Sintático

        ListTokenSource a = new ListTokenSource();
        a.nextToken();
        CC_2021_2Parser parser = new CC_2021_2Parser(tokens);
        ParseTree tree = parser.acceptAll();
        ParseTreeWalker walker = new ParseTreeWalker();
        UppercaseMethodListener listener= new UppercaseMethodListener();

        walker.walk(listener, tree);
        tokens.getTokens().stream().filter(token ->  token.getChannel() != Token.HIDDEN_CHANNEL).forEach(it ->
                System.out.println(it.getText()));
        */

    }


/*
  Codigo comentado pois será utilizado no Analisador Sintático
class ErrorsListener extends CC_2021_2BaseListener {

    private List<String> errors = new ArrayList<>();

    // ... getter for errors

    @Override
    public void enterProgram(CC_2021_2Parser.ProgramContext ctx) {
    }
}
*/



}

