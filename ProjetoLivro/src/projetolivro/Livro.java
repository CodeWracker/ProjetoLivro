package projetolivro;

import java.util.Random;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //Metodos Publicos
    public void detalhes(){
        if(this.leitor != null){
            System.out.println("O livro está com " + this.leitor.getNome());
            System.out.println("O Titulo é " + this.getTitulo());
            System.out.println("O autor é " + this.getAutor());
            System.out.println("Esta aberto? " + this.isAberto());
            System.out.println("O livro tem " + this.getTotPaginas() + " paginas");
            if(this.isAberto()){
                System.out.println("O leitor está na pagina " + this.getPagAtual());
            }
        }
        else{
            System.out.println("O livro está guardad0");
        }
    }
    //Metodos Especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa lei) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = lei;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
    @Override
    public void folhear() {
        Random aleatorio = new Random();
        this.setPagAtual(aleatorio.nextInt(this.getTotPaginas()));
    }
    
}
