/**
 * Classe para mostrar a modelagem Orientada a Objetos de um c&iacute;rculo.
 */
public class Circulo {
    
    private double raio;
    
    /**
     * Construtor sem par&acirc;metros para objetos da classe <code>Circulo</code>.
     * Cria um c&iacute;rculo com raio igual a <code>1.0</code>.
     */
    public Circulo() {
        raio = 1.0;
    }
    
    /**
     * Construtor para objetos da classe <code>Circulo</code>.
     * Cria um c&iacute;rculo com um raio fornecido como par&acirc;metro..
     * @param r Raio do novo c&iacute;rculo.
     */
    public Circulo(double r) {
        raio = r;
    }
    
    /**
     * Retorna a circunfer&ecirc;ncia da inst&acirc;ncia corrente do c&iacute;rculo.
     * @return Circunfer&ecirc;ncia da inst&acirc;ncia corrente do c&iacute;rculo.
     */
    public double circunferencia() {
        return 2.0 * Math.PI * raio;
    }
    
    /**
     * Retorna a &aacute;rea da inst&acirc;ncia corrente do c&iacute;rculo.
     * @return &Aacute;rea da inst&acirc;ncia corrente do c&iacute;rculo.
     */
    public double area() {
        return Math.PI * raio * raio;
    }

    /**
     * Retorna o raio da inst&acirc;ncia corrente do c&iacute;rculo.
     * @return Raio da inst&acirc;ncia corrente do c&iacute;rculo.
     */
    public double obtemRaio() {
            return raio;
    }
    
    /**
     * Define o raio da inst&acirc;ncia corrente do c&iacute;rculo com um raio recebido como par&acirc;metro.
     * @param r Novo raio c&iacute;rculo.
     */
    public void defineRaio(double r) {
        raio = r;
    }
    
    /**
     * Calcula a circunfer&ecirc;ncia de um c&iacute;rculo de raio <code>r</code>, sem a necessidade de criar
     * um objeto da classe <code>Circulo</code>.
     * @param r Raio do c&iacute;rculo para o qual ser&aacute; calculada a circunfer&ecirc;ncia.
     * @return Circunfer&ecirc;ncia do c&iacute;rculo de raio <code>r</code>.
     */
    public static double circunferencia(double r) {
        return 2.0 * Math.PI * r;
    }
    
    /**
     * Calcula a &aacute;rea de um c&iacute;rculo de raio <code>r</code>, sem a necessidade de criar
     * um objeto da classe <code>Circulo</code>.
     * @param r Raio do c&iacute;rculo para o qual ser&aacute; calculada a &aacute;rea.
     * @return &Aacute;rea do c&iacute;rculo de raio <code>r</code>.
     */
    public static double area(double r) {
        return Math.PI * r * r;
    }
    
    /**
     * Cria um c&iacute;rculo que tenha a &aacute;rea especificada como par&acirc;metro. N&atilde;o h&aacute; a
     * necessidade de criar um objeto para executar este m&eacute;todo.
     * @param a &Aacute;rea do c&iacute;rculo que se deseja criar.
     * @return Objeto da classe <code>Circulo</code> que tem o raio necess&aacute;rio para se ter um c&iacute;rculo
     * com a &aacute;rea especificada.  
     */
    public static Circulo comArea(double a) {
        double r = Math.sqrt( a / Math.PI );
        return new Circulo(r);
    }
    
    /**
     * Cria um c&iacute;rculo que tenha a circunfer&ecirc;ncia especificada como par&acirc;metro. N&atilde;o h&aacute; a
     * necessidade de criar um objeto para executar este m&eacute;todo.
     * @param c Circunfer&ecirc;ncia do c&iacute;rculo que se deseja criar.
     * @return Objeto da classe <code>Circulo</code> que tem o raio necess&aacute;rio para se ter um c&iacute;rculo
     * com a circunfer&ecirc;ncia especificada.
     */
    public static Circulo comCircunferencia(double c) {
        double r = c / ( 2*Math.PI );
        return new Circulo(r);
    }

}
