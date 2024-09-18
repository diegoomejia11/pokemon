import A.*;

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
         * Electabuzz
         * Jolteon
         * Zapdos
         * 
         */



        //Entrenador Demian = new Entrenador();

        // Hacedor de combates

        // 1 2 - 2 1 -> g v G

        // Ciclo de pelea{}
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
