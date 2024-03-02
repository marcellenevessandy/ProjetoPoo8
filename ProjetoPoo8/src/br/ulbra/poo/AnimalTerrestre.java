package br.ulbra.poo;

public class AnimalTerrestre extends Animal {

    private int numPatas;
    private String tipoComida;

    public AnimalTerrestre() {
        super();
  
    }

    public void andar() {
        super.andar();
        System.out.println("Trotando.");
    }

    public void falar() {
        super.falar();
        System.out.println("XI XI XI...");
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public String getTipoComida() {
        return tipoComida;
    }
}
