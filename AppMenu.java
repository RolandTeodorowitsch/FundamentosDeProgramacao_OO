import java.util.Scanner;

public class AppMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu(4);
        menu.addOption("Lancar");
        menu.addOption("Fechar");
        menu.addOption("Pular");
        menu.addOption("Sair");
        int opcao = menu.getInput(in);
        System.out.println("> Opcao selecionada = "+opcao);
    }
}