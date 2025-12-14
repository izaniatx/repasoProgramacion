package POO_ejercicios3.ej5;

public class Empleado extends Persona{
    private int dinero;

    public Empleado (String nombre, String dni, int altura, int dinero){
        super(nombre, dni, altura);
        this.dinero = dinero;
    }

    public void ganarDinero(int cantidad){
        this.dinero = this.dinero + cantidad;
    }

    public void gastarDinero(int cantidad){
        this.dinero = this.dinero - cantidad;
    }


    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return getNombre() + " - " + getAltura() + " - Dinero: " + this.dinero;
    }
}
