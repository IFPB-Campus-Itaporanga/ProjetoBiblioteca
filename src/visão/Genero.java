package visão;

public enum Genero {
    ROMANCE(1),
    SCIFI(2),
    TERROR(3),
    BIOGRAFIA(4);

    private final int idGenero;

    Genero(int id) {
        idGenero = id;
    }

    public int getIdGenero(){
        return idGenero;
    }

//    public Genero getGenero(int idGenero){
//        for (Genero g: Genero.values()) {
//            if (g.idGenero == idGenero) return g;
//        }
//        return null;
//    }
}
