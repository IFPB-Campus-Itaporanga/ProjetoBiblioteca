package visão;

import controlador.AcervoController;
import modelo.Acervo;
import modelo.Livro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tituloLivro, autorLivro, editoraLivro;
        int anoPublicaoLivro;
        Livro livro;
        AcervoController acervoController = new AcervoController();
        Acervo acervoAtual;
        String comando;


        do {

            System.out.println("Digite o título do livro:");
            tituloLivro = leitor.nextLine();

            System.out.println("Digite o nome do autor");
            autorLivro = leitor.nextLine();

            System.out.println("Digite o nome da editora");
            editoraLivro = leitor.nextLine();

            System.out.println("Digite o ano de publicação");
            anoPublicaoLivro = leitor.nextInt();

            livro = new Livro(tituloLivro,anoPublicaoLivro,autorLivro,editoraLivro);

            acervoAtual = acervoController.cadastrarLivro(livro);

            System.out.println("Cadastar outro livro?");
            comando = leitor.nextLine();

        }while(comando.equals("YES"));

        System.out.println("*************************************");
        System.out.println("LIVROS DA DOUGLATECA");
        System.out.println("*************************************");
        for(Livro itemLivro: acervoAtual.getLivros()){
            System.out.println("Título: " + itemLivro.getTituloLivro());
            System.out.println("Autor: " + itemLivro.getAutorLivro());
            System.out.println("Data de publicação: " + itemLivro.getAnoPublicacao());
            System.out.println("Editora: " + itemLivro.getEditoraLivro());
            System.out.println("____________________________________________");
        }
    }
}
