import A.*;

public class Aldo {
    public Pokemon[] pokemones ={ 
        // Pokémon de tipo Normal
        new Pokemon("Rattata", new Tipo ("normal"), new Ataque("Hyper fang",new Tipo("normal"), 80, 90), 30),
        new Pokemon("Meowth", new Tipo ("normal"), new Ataque("Slash", new Tipo("normal"),40, 100), 50),

        // Pokémon de tipo Fuego
        new Pokemon("Charmander", new Tipo ("fuego"), new Ataque("Flamethrower", new Tipo("fuego"),95, 100), 39),

        // Pokémon de tipo Eléctrico
        new Pokemon("Pikachu", new Tipo ("electrico"), new Ataque("Thunderbolt", new Tipo("electrico"),95, 100), 35),

        // Pokémon de tipo Agua
        new Pokemon("Poliwag", new Tipo ("agua"), new Ataque("Hydro Pump", new Tipo("agua"),110, 80), 40),

        // Pokémon de tipo Planta
        new Pokemon("Tangela", new Tipo ("planta"), new Ataque("Vine whip", new Tipo("planta"),35, 100), 65)

    };
}
