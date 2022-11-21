public class Contador {
    
   private int valor;

   public Contador() {
       valor = 0;
   }
   
   public Contador(int v) {
       valor =  v;
   }
   
   public void incrementa() {
       valor = valor + 1;
   }

   public int obtemValor() {
       return valor;
   }
   
   public void defineValor(int v) {
       valor = v;
   }
}
