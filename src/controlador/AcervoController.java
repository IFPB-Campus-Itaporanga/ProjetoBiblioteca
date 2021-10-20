package controlador;

import modelo.Acervo;
import modelo.Livro;

public class AcervoController {

   Acervo acervo = new Acervo();

   public Acervo cadastrarLivro(Livro livro){
       acervo.getLivros().add(livro);

       return acervo;
   }

}
