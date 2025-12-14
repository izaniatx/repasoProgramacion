package POO_ejercicios3.ej1;

public class Main {
    public void main(String[] args){
        Piolin piolin1 = new Piolin('A', 12, 16, 5);
        Loro loro1 = new Loro('E', 10, 'N', "Azul");

        piolin1.quienSoy();
        loro1.quienSoy();

        piolin1.medir();
        loro1.deDondeEres();

        piolin1.setTalla(50);
        piolin1.medir();

        loro1.setZona('S');
        loro1.deDondeEres();

        piolin1.getNumPajaros();

    }
}
