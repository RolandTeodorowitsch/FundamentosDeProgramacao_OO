public class AppCaixaReigstradora {
    public static void main(String[] args) {
        CaixaRegistradora caixa = new CaixaRegistradora();
        caixa.adicionaItem(1.95);
        caixa.adicionaItem(0.95);
        caixa.adicionaItem(2.50);
        System.out.println( caixa.obtemNumItens()==3?"OK":"ERRO" );
        System.out.println( caixa.obtemTotal()==5.4?"OK":"ERRO" );
  }
}
