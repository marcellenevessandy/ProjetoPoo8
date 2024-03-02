package br.ulbra.poo;

public class TesteHeranca {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNome("Puffy");
        animal.setEspecie("Cachorro");
        animal.andar();
        animal.falar();

        AnimalTerrestre animalT = new AnimalTerrestre();
        animalT.setNome("Puffy");
        animalT.setEspecie("Cachorro");
        animalT.setNumPatas(5);
        animalT.setTipoComida("Ração");
        animalT.getNome();
        animalT.getEspecie();
        animalT.getNumPatas();
        animalT.getTipoComida();
        animalT.andar();
        animalT.falar();

        AnimalAquatico animalA = new AnimalAquatico();
        animalA.setNome("Puffy");
        animalA.setEspecie("Cachorro");
        animalA.setProfundidade(5);
        animalA.setVelocidade(6);
        System.out.println("nome:"+animalA.getNome());
        animalA.getEspecie();
        animalA.getProfundidade();
        animalA.getVelocidade();
        animalA.andar();
        animalA.falar();

        AnimalAereo animalAe = new AnimalAereo();
        animalAe.setNome("Puffy");
        animalAe.setEspecie("Cachorro");
        animalAe.setAltitude(5);
        animalAe.setEnvergadura(6);
        animalAe.getNome();
        animalAe.getEspecie();
        animalAe.getAltitude();
        animalAe.getEnvergadura();
        animalAe.andar();
        animalAe.falar();

    }

}
