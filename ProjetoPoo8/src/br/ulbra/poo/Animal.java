package br.ulbra.poo;

public class Animal {

    protected String nome;
    protected String especie;

    public Animal() {
    }

    public void andar() {
        System.out.println("Andando!");
    }

    public void falar() {
        System.out.println("La La La...");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
    
}
