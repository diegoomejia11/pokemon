import A.*;

public class Aldo {

    public static void main (String[]args){
	pokemon[] pokemones ={ 
// Pokémon de tipo Normal
 new Pokemon("Rattata", new Tipo ("normal"), new Ataque("Hyper fang", 80, 90), 30);
 new Pokemon("Meowth", new Tipo ("normal"), new Ataque("Slash", 40, 100), 50);

// Pokémon de tipo Fuego
 new Pokemon("Charmander", new Tipo ("fuego"), new Ataque("Flamethrower", 95, 100), 39);

// Pokémon de tipo Eléctrico
 new Pokemon("Pikachu", new Tipo ("eléctrico"), new Ataque("Thunderbolt", 95, 100), 35);

// Pokémon de tipo Agua
 new Pokemon("Poliwag", new Tipo ("agua"), new Ataque("Hydro Pump", 110, 80), 40);

// Pokémon de tipo Planta
 new Pokemon("Tangela", new Tipo ("planta"), new Ataque("Vine whip", 35, 100), 65);

    }
	System.out.println("¡Rattata yo te eligo!");
        System.out.println("¡Meowth yo te eligo!");
        System.out.println("¡Charmander yo te eligo!");
        System.out.println("¡Pikachu yo te eligo, listo para usar el Thunderbolt!");
        System.out.println("¡Poliwag yo te eligo!");
        System.out.println("¡Tangela yo te eligo!");

    }
}
