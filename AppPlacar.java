import java.io.FileNotFoundException;

public class AppPlacar {
    public static void main(String[] args) throws FileNotFoundException {
        
        Placar placar = new Placar();
        try {
            placar.carregar("placar.csv");
            System.out.println("> Placar carregado com sucesso...");
        }
        catch(Exception e) {
            System.out.println("> Iniciando com placar vazio...");
            placar.limpar();
        }

        placar.mostrar();
        placar.adicionar("Nome 100", 100);
        placar.adicionar("Nome 90", 90);
        placar.adicionar("Nome 80", 80);
        placar.adicionar("Nome 70", 70);
        placar.adicionar("Nome 60", 60);
        placar.adicionar("Nome 50", 50);
        placar.adicionar("Nome 40", 40);
        placar.adicionar("Nome 30", 30);
        placar.adicionar("Nome 20", 20);
        placar.adicionar("Nome 10", 10);
        placar.adicionar("Nome 110", 110);
        placar.adicionar("Nome 5", 5);
        placar.mostrar();
        placar.salvar("placar.csv");
        placar.limpar();
        placar.mostrar();
        placar.carregar("placar.csv");
        placar.mostrar();
        
        /*
        try {
            Placar.mostra();
        }
        catch(FileNotFoundException e) {
            System.out.println("> Arquivo de placar nao foi encontrado. Sera gerado um novo placar...\n");
        }
        */
    }
}