package controlador;

import modelo.Acervo;
import modelo.Livro;

public class AcervoController {

   Acervo acervo = new Acervo();

   public Acervo cadastrarLivro(Livro livro){
       acervo.getLivros().add(livro);

       return acervo;
   }

   public void imprimir(){
       System.out.println("\n*************************************");
       System.out.println("LIVROS DA DOUGLATECA");
       System.out.println("*************************************");
       for(Livro itemLivro: acervo.getLivros()){
           System.out.println("\nTítulo: " + itemLivro.getTituloLivro());
           System.out.println("Autor: " + itemLivro.getAutorLivro());
           System.out.println("Data de publicação: " + itemLivro.getAnoPublicacao());
           System.out.println("Editora: " + itemLivro.getEditoraLivro());
           System.out.println("Genero: " + itemLivro.getGenero());
           System.out.println("____________________________________________");
       }
   }
}
