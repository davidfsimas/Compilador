package gals;
import CompiladorIDE.MySets;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        String lexeme = token.getLexeme();
        String tipo="";
        switch (action){
            case 1: //<TIPOS>
                tipo = token.getLexeme();
                break;
            case 2: //<ID>
                MySets.getMensagem(Integer.toString(action));
                MySets.getMensagem(token.getLexeme().toString());
                System.out.println("Token: "+token.toString());
                break;
            case 10: //<MAIN>
                System.out.println("Token: "+token.toString());
                break;
            case 11: //<CORPO>
                if ("{".equals(lexeme)) {
                    System.out.println("Abre escopo");
                }
                if ("}".equals(lexeme)) {
                    System.out.println("Fecha escopo");
                }
                System.out.println("Token: "+token.toString());
                break;
        }
        
       // System.out.println("Acao #"+action+", Token: "+token);
    }	
}
