package POO_ejercicios3.ej1;

public class Piolin extends Canario{
    private int numPeliculasMostradas;

    public Piolin(char sexo, int edad, double talla, int numPeliculasMostradas) {
        super(sexo, edad, talla);
        this.numPeliculasMostradas = numPeliculasMostradas;
    }

    public int getNumPeliculasMostradas() {
        return numPeliculasMostradas;
    }

    public void setNumPeliculasMostradas(int numPeliculasMostradas) {
        this.numPeliculasMostradas = numPeliculasMostradas;
    }
}
