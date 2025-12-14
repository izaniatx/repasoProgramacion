package POO_ejercicios3.ej1;

public class Loro extends Pajaro{
    private char zona; // N-Norte, S-Sur, E-Este, O-Oeste.
    private String color;

    public Loro(char sexo, int edad, char zona, String color) {
        super(sexo, edad);
        this.zona = zona;
        this.color = color;
    }

    public void deDondeEres(){
        System.out.println("Este loro es del: "+this.zona);
    }

    public char getZona() {
        return zona;
    }

    public void setZona(char zona) {
        this.zona = zona;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
