package POO_ejercicios3.ej5;

public class Movil {
    private String numero;
    private int bateria;

    public Movil (String numero, int bateria){
        this.numero = numero;
        this.bateria = bateria;
    }

    public void usar(){
        this.bateria = this.bateria - 1;
    }

}
