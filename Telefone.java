import java.lang.IllegalArgumentException;

public class Telefone {

    private int ddi;
    private int ddd;
    private int numero;
    private int ramal;

    public Telefone() {
        ddi = ddd = numero = ramal = -1;
    }
    
    public Telefone(int di, int dd, int n, int r) {
        ddi = di; ddd = dd; numero = n; ramal = r;
    }
    
    public Telefone(int di, int dd, int n) {
        ddi = di; ddd = dd; numero = n; ramal = -1;
    }
    
    public int obtemDDI() { return ddi; }
    
    public int obtemDDD() { return ddd; }
    
    public int obtemNumero() { return numero; }
    
    public int obtemRamal() { return ramal; }
    
    public void defineDDI(int di) { ddi = di; }
    
    public void defineDDD(int dd) { ddd = dd; }
    
    public void defineNumero(int n) { numero = n; }
    
    public void defineRamal(int r) { ramal = r; }
    
    public String toString() {
        String res = "";
        if (ddi != -1)
            res += "+"+ddi;
        if (ddd != -1)
            res += "("+ddd+") ";
        res += numero;
        if (ramal != -1) {
            res += " - Ramal "+ramal; 
        }
        return res;
    }
    
    public static Telefone parseTelefone(String s) {
        // Qual exceçao lançar?
        // java.text.ParseException poderia ser uma opcao (no entanto, ela e uma exceçao verificada)
        // java.lang.IllegalArgumentException, por outro lado, nao e verificada e gera um erro de execuçao
        int len = s.length();
        String strNum = "";
        int di = -1, dd = -1, num = -1, ram = -1;
        int i=0;
        while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos
        if ( i<len && s.charAt(i)=='+' ) {
            ++i;
            // Le DDI
            strNum = "";
            while ( i<len && Character.isDigit(s.charAt(i)) )
                    strNum += s.charAt(i++);
            if ( strNum.length() < 1 || strNum.length() > 3 ) throw new IllegalArgumentException("Número de DDI inválido");
            di = Integer.parseInt(strNum);
            while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos
        }
        if ( i<len && s.charAt(i)=='(' ) {
            ++i;
            while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos
            // Le DDD
            strNum = "";
            while ( i<len && Character.isDigit(s.charAt(i)) )
                    strNum += s.charAt(i++);
            if ( strNum.length() < 1 || strNum.length() > 3 ) throw new IllegalArgumentException("Número de DDD inválido");
            dd = Integer.parseInt(strNum);
            while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos
            if ( i>=len || s.charAt(i)!=')' ) throw new IllegalArgumentException("Formato de DDD inválido");
            ++i; // Pula fecha-parenteses
            while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos  
        }
        // Le numero
        strNum = "";
        while ( i<len ) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                strNum += s.charAt(i);
            else if ( c!='-' )
                break;
            ++i;
        }
        if ( strNum.length() < 7 || strNum.length() > 9 ) throw new IllegalArgumentException("Número de telefone inválido");
        num = Integer.parseInt(strNum);
        while ( i<len && s.charAt(i)==' ') ++i; // Pula espacos
        // Le ramal
        
        
        
        if ( i!=len )
            throw new IllegalArgumentException("Número de telefone fora do formato");
        return new Telefone(di, dd, num, ram);
    }
}