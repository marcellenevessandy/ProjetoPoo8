package br.ulbra.poo;

public class AnimalAquatico extends Animal{
    
    private double profundidade;
    private int velocidade;
    
    public AnimalAquatico (){
        super();
   
    }
    public void andar(){
        System.out.println("PLOF PLOF....");
    }
    public void falar () {
        System.out.println("CRI CRI CRI...");
    }
    public void setProfundidade(double profundidade){
    this.profundidade = profundidade;
    }
    public void setVelocidade (int velocidade){
    this.velocidade = velocidade;
    }
    public double getProfundidade(){
    return profundidade;
    }
    public int getVelocidade(){
    return velocidade;
    }
}
