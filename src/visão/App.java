package visão;

import controlador.AcervoController;
import modelo.Acervo;
import modelo.Livro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char comando;
        int anoPublicaoLivro, idGenero;
        String tituloLivro, autorLivro, editoraLivro;
        Genero genero;
        Livro livro;
        AcervoController acervoController = new AcervoController();
        Acervo acervoAtual;

        Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("Digite o título do livro:");
            tituloLivro = leitor.nextLine();

            System.out.println("Digite o nome do autor:");
            autorLivro = leitor.nextLine();

            System.out.println("Digite o nome da editora:");
            editoraLivro = leitor.nextLine();

            System.out.println("Digite o ano de publicação:");
            anoPublicaoLivro = leitor.nextInt();

            System.out.println("Digite o gênero do Livro \n" +
                    "    1 p/ ROMANCE,\n" +
                    "    2 p/ SCIFI,\n" +
                    "    3 p/ TERROR,\n" +
                    "    4 p/ BIOGRAFIA");
            idGenero = leitor.nextInt();
            genero = Genero.values()[idGenero-1];

            livro = new Livro(tituloLivro,anoPublicaoLivro,autorLivro,editoraLivro,genero);
            acervoAtual = acervoController.cadastrarLivro(livro);


            System.out.println("Cadastar outro livro?(1-SIM,0-NÃO):");
            comando = leitor.next().charAt(0);
            leitor.nextLine();

        }while(comando == '1');

        leitor.close();

        acervoController.imprimir();
    }
}
