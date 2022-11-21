import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Placar {
    
    private final int TAM = 10;
    
    private String[] nome;
    private int[] pontos;
    int numItens;
    
    public Placar() {
        numItens = 0;
        nome = new String[TAM+1];
        pontos = new int[TAM+1];
    }
    
    public void limpar() {
        numItens = 0;
    }
    
    public void mostrar() {
        System.out.println("----- Placar -----------------");
        for (int i=0; i<numItens; ++i) {
            System.out.printf("%2d. %-20s > %3d\n",i+1,nome[i],pontos[i]);
        }
        System.out.println("------------------------------");
        
    }
    
    public void adicionar(String n, int p) {
        nome[numItens] = n;
        pontos[numItens] = p;
        ++numItens;
        for (int i=0; i<numItens-1; ++i) {
            int men = i;
            for (int j=i+1; j<numItens; ++j) {
                if (pontos[j] < pontos[men])
                    men = j;
            }
            if (men != i) {
                int auxI = pontos[men];
                pontos[men] = pontos[i];
                pontos[i] = auxI;
                String auxS = nome[men];
                nome[men] = nome[i];
                nome[i] = auxS;
            }
        }
        if (numItens > TAM)
            numItens = TAM;
    }
    
    public void salvar(String nomeArquivo) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(nomeArquivo);
        for (int i=0; i<numItens; ++i)
            out.printf("%s;%d\n",nome[i],pontos[i]);
        out.close();
    }
    
    public void carregar(String nomeArquivo) throws FileNotFoundException {
        Scanner inFile = new Scanner( new File(nomeArquivo) );
        numItens = 0;
        while ( inFile.hasNextLine() ) {
            String linha = inFile.nextLine();
            String[] campos = linha.split(";");
            if (campos.length != 2) {
                System.out.println("> Numero invalido de campos no arquivo CSV...");
                break;
            }
            String n = campos[0];
            int p = Integer.parseInt(campos[1]);
            adicionar(n,p);
        }
        inFile.close();
    }
    
}