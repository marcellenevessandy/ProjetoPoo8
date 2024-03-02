package br.ulbra.poo;

public class AnimalAereo extends Animal{
    
    private int altitude;
    private double envergadura;
    
    public AnimalAereo(){
    super();
   
    }
    public void voar(){
        System.out.println("FLAT FLAT...");
    }
    public void andar(){
        System.out.println("Pic Pic...");
    }
    public void falar (){
        System.out.println("KA KA KA ");
    }
    
    public void setAltitude(int altitude){
    this.altitude = altitude;
    }
    public void setEnvergadura(double envergadura){
    this.envergadura = envergadura;
    }
    public int getAltitude (){
    return altitude;
    }
    public double getEnvergadura(){
    return envergadura;
    }
}
