public class AppContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println("c1: "+c1.obtemValor());
        for (int i=0; i<10; ++i)
            c1.incrementa();
        System.out.println("c1: "+c1.obtemValor());
        
        Contador c2 = new Contador(100);
        System.out.println("c2: "+c2.obtemValor());
        for (int i=0; i<100; ++i)
            c2.incrementa();
        System.out.println("c2: "+c2.obtemValor());
        c2.defineValor( c2.obtemValor() + 100 );
        System.out.println("c2: "+c2.obtemValor());
    }
}