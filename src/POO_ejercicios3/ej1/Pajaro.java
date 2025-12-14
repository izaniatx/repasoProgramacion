package POO_ejercicios3.ej1;

public class Pajaro {
    private char sexo;
    private int edad;
    private static int numAvesCreadas;

    public Pajaro(char sexo, int edad){
        this.edad = edad;
        this.sexo = sexo;
        numAvesCreadas++;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumPajaros(){
        return this.numAvesCreadas;
    }

    public void quienSoy(){
        System.out.println("La edad es: "+this.edad+", y su sexo es: "+this.sexo+".");
    }


}
