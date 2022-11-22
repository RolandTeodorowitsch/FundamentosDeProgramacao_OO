public class CaixaRegistradora {
    private int numItens;
    private double total;
 
    public CaixaRegistradora() {
        limpa();
    }
    
    public int obtemNumItens() {
        return numItens;
    }
    
    public double obtemTotal() {
        return total;
    }
    
    public void adicionaItem(double preco) {
        ++numItens;
        total += preco;
    }

    public void limpa() {
        numItens = 0;
        total = 0.0;
    }
}