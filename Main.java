public class Main{
    static Tipo[] tipos = {new Tipo("normal"),
        new Tipo("fuego"),
        new Tipo("agua"),
        new Tipo("planta"),
        new Tipo("electrico")};
    public static void main(String[] args) {
        double[][] combate = {{1.0, 1.0, 1.0, 1.0, 1.0},
                              {1.0, 0.5, 0.5, 2.0, 1.0},
                              {1.0, 2.0, 0.5, 0.5, 1.0},
                              {1.0, 0.5, 2.0, 0.5, 1.0},
                              {1.0, 1.0, 2.0, 0.5, 0.5},
                            }; 

        // Necesitamos máximo 24 pokemones diferentes de alguno de los 5 tipos
        // Cada pokemón necesita solo 1 ataque

        // Usen esta página: https://pokemon.fandom.com/wiki/Category:Generation_I_Pok%C3%A9mon
        // Tiene una lista de los pokemones de primera generación con la info de c/u

        /**
         *      NORMAL
         * Rattata
         * Meowth
         * Ditto
         * Eeve
         * Snorlax
         * 
         *      FUEGO
         * Charmander
         * Vulpix
         * Ponyta
         * Flareon
         * Moltres
         * 
         *      AGUA
         * Squirtle
         * Psyduck
         * Poliwag
         * Seel
         * Staryu
         * Magikarp
         * Vaporeon
         * Articuno
         * 
         *      PLANTA
         * Tangela
         * 
         *      ELECTRICO
         * Pikachu
         * Voltrob
         * Electrabuzz
         * Jolteon
         * Zapdos
         * 
         */


        //Pokemon pikachu = new Pokemon("pikachu",
        //                              tipos[4],
        //                              new Ataque("impactrueno",
        //                                         tipos[4],
        //                                         20,
        //                                         30),
        //                              200);
    }

    public static int indexOf(String nombre){
        for (int i = 0; i < 5; i++){
            if (tipos[i].nombre == nombre){
                return i;
            }
        }

        return -1;
    }
}

class Pokemon{
    String nombre;
    Tipo tipo;
    Ataque ataque;

    int HP;

    public Pokemon(String nombre, Tipo tipo, Ataque ataque, int HP){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.HP = HP;
    }
}

class Ataque{
    String nombre;
    Tipo tipo;

    int poder;
    int probabilidad;

    public Ataque(String nombre, Tipo tipo, int poder, int probabilidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
        this.probabilidad = probabilidad;
    }
}

class Tipo{
    String nombre;

    public Tipo(String nombre){
        this.nombre = nombre;
    }
}
