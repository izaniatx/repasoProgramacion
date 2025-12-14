package POO_ejercicios3.ej1;

public class Canario extends Pajaro{
    private double talla;

    public Canario (char sexo, int edad, double talla){
        super(sexo, edad);
        this.talla = talla;
    }

    public void medir(){
        double talla = this.talla;
        if (30 < talla ){
            System.out.println("La talla del Canario es Grande.");
        }else if (talla < 30 && 15 < talla) {
            System.out.println("La talla del Canario en Mediana");
        }else {
            System.out.println("La talla del Canario es Pequeña ");
        }
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
}
