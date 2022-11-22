public class Pessoa {
    private String nome;
    private int idade;
    private Telefone telefone;
    public Pessoa() {
        nome = "";
        idade = 0;
        telefone = new Telefone();
    }
    public Pessoa(String n, int i, Telefone t) {
        nome = n;
        idade = i;
        telefone = t;
    }
    public String obtemNome() { return nome; }
    public int obtemIdade() { return idade; }
    public Telefone obtemTelefone() { return telefone; }
    public void defineNome(String n) { nome = n; }
    public void defineIdade(int i) { idade = i; }
    public void defineTelefone(Telefone t) { telefone = t; }
    public String toString() {
        return nome + " (" + idade + " anos) - " + telefone.toString();
    }
}