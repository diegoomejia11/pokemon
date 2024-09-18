import A.*;

public class Demian {
    public static void main(String[] args){
        Pokemon[] pokemones = {
            new Pokemon("Snorlax", new Tipo("normal"), new Ataque("Headbutt", new Tipo("normal"), 70, 100), 160),
            new Pokemon("Ponyta", new Tipo("fuego"), new Ataque("Ember", new Tipo("fuego"), 40, 100), 50),
            new Pokemon("Electabuzz", new Tipo("electrico"), new Ataque("Quick Attack", new Tipo("normal"), 40, 100), 65),
            new Pokemon("Psyduck", new Tipo("agua"), new Ataque("Scratch", new Tipo("normal"), 40, 100), 50),
            new Pokemon("Seel", new Tipo("agua"), new Ataque("Headbutt", new Tipo("normal"), 70, 100), 65),
            new Pokemon("Vaporeon", new Tipo("agua"), new Ataque("Water gun", new Tipo("agua"), 40, 100), 130)
        };
    }
}
