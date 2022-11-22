import java.util.Scanner;

public class Menu {
    
    private String[] options;
    private int numOptions;
    
    public Menu(int maxOptions) {
        numOptions = 0;
        options = new String[maxOptions];
    }
    
    public void addOption(String option) {
        if (numOptions < options.length)
            options[ numOptions++ ] = option;
    }
    
    public int getInput(Scanner in) {
        for (int i=0; i<numOptions; ++i)
            System.out.printf("[%d] %s\n",i+1,options[i]);
        int res = -1;
        while (res < 1 || res > numOptions) {
            System.out.print("Digige a sua opcao: ");
            res = in.nextInt();
        }
        return res;
    }
    
}
