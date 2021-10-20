package modelo;

public class Livro {
    private String tituloLivro;
    private int anoPublicacao;
    private String autorLivro;
    private String editoraLivro;

    public Livro(String tituloLivro, String autorLivro){
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
    }

    public Livro(String tituloLivro, int anoPublicacao, String autorLivro, String editoraLivro) {
        this.tituloLivro = tituloLivro;
        this.anoPublicacao = anoPublicacao;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }
}
