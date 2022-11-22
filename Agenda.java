import java.util.Scanner;

public class Agenda {
    
    final static int TAM = 5;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // versaoProcedural(in);
        versaoOrientadaAObjetos(in);
    }

    public static void versaoOrientadaAObjetos(Scanner in) {
        Pessoa[] agenda = new Pessoa[TAM];
        for (int i=0; i<TAM; ++i)
            agenda[i] = new Pessoa( in.nextLine(),
                                    Integer.parseInt( in.nextLine()),
                                    Telefone.parseTelefone(in.nextLine()) );
        for (int i=0; i<TAM; ++i)
            System.out.println( agenda[i].toString() );
    }
    
    public static void versaoProcedural(Scanner in) {
        String[] nomes = new String[TAM];
        int[] idades = new int[TAM];
        String[] telefones = new String[TAM];
        for (int i=0; i<TAM; ++i) {
            nomes[i] = in.nextLine();
            idades[i] = Integer.parseInt( in.nextLine() );
            telefones[i] = in.nextLine();
        }
        for (int i=0; i<TAM; ++i)
            System.out.printf("%s (%d anos) - %s\n",nomes[i], idades[i], telefones[i]);
    }
}