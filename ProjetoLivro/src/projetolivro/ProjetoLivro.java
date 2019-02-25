package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[5];
        p[0] = new Pessoa("Rodrigo", 18, "Masculino");
        Livro l1 = new Livro("No game No Life", "Yuu", 400, p[0]);
        l1.abrir();
        l1.avancarPag();
        l1.folhear();
        l1.detalhes();
    }
    
}
