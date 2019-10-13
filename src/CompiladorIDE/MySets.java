
package CompiladorIDE;

public class MySets {
   private static String Mensagem = "";

   public static synchronized String getMensagem(String novaMsg) {
      Mensagem = Mensagem + novaMsg;
      return MySets.Mensagem;
   }
   public static synchronized void clearMensagem() {
      Mensagem = "";             
   }
}
