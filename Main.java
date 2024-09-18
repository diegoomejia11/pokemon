import A.*;
import java.util.Random;
/*
 * @author Jorge Demian Muñoz Marín   
 * @author Irving Axel Tapia Anrubio    
 * @author Aldo Jael Cervantes González   
 * @author Diego Mejía Arroyo
 * 
 * @version 1.0
 * 
 * Clase principal que realiza batallas Pokémon entre entrenadores.
 * Contiene la lógica de los combates y la aleatorización de los equipos.
 */
public class Main{
    /*
     * Nombre del entrenador que ha ganado la última batalla.
     */
    static String global_entrenador;

    /*
     * Arreglo de Pokémon del entrenador ganador de la última batalla.
     */
    static Pokemon[] global_pokemones;
    
    /*
     * Arreglo de objetos de la clase Tipo que representa los tipos de Pokémon (normal, fuego, agua, planta, eléctrico).
     */
    static Tipo[] tipos = {new Tipo("normal"),
                           new Tipo("fuego"),
                           new Tipo("agua"),
                           new Tipo("planta"),
                           new Tipo("electrico")};


    /*
     * Inicializador de objeto Random para la generación de valores aleatorios.
     */
    static Random random = new Random();

    /*
     * Matriz que representa la efectividad de los ataques en la batallas Pokémon.
     * Indica si un ataque es super efectivo (2.0), no muy efectivo (0.5), o neutral (1.0).
     * Estos se obtienen con las interacciones entre las distintas naturalezas.
     */
    static double[][] combate = {{1.0, 1.0, 1.0, 1.0, 1.0},
                                 {1.0, 0.5, 0.5, 2.0, 1.0},
                                 {1.0, 2.0, 0.5, 0.5, 1.0},
                                 {1.0, 0.5, 2.0, 0.5, 1.0},
                                 {1.0, 1.0, 2.0, 0.5, 0.5},
                                }; 

    /*
     * Método principal que ejecuta las batallas Pokémon.
     * Crea a los entrenadores, mezcla sus equipos y realiza las peleas.
     */
    public static void main(String[] args) {
        // Se inicializan las clases Demian, Axel, Aldo y Diego
        Demian demian = new Demian();
        Axel axel = new Axel();
        Aldo aldo = new Aldo();
        Diego diego = new Diego();

        int[] array = {0, 1, 2, 3};  // Se crea un array y se mezcla
        shuffleArray(array);

        Pokemon[][] pokemones = {demian.pokemones, axel.pokemones, aldo.pokemones, diego.pokemones};  // Se declaran los pokemones
        String[] nombres = {"Demian", "Axel", "Aldo", "Diego"};  // Se declaran los nombres

        // Acá los entrenadores del 0 al 3 se calculan consultando la lista de nombres basándose en el array mezclado
        String entrenador0 = nombres[array[0]]; String entrenador1 = nombres[array[1]];
        String entrenador2 = nombres[array[2]]; String entrenador3 = nombres[array[3]];

        // Lo mismo para los pokemones, es importante mantener el orden
        Pokemon[] pokemones0 = pokemones[array[0]]; Pokemon[] pokemones1 = pokemones[array[1]];
        Pokemon[] pokemones2 = pokemones[array[2]]; Pokemon[] pokemones3 = pokemones[array[3]];
        
        // Se realizan las peleas de #0 vs #1, y #2 vs #3.
        pelea(entrenador0, entrenador1, pokemones0, pokemones1);
        String ganador0 = global_entrenador; Pokemon[] pkm0 = global_pokemones;  // Se guarda el ganador de #0 vs #1
        pelea(entrenador2, entrenador3, pokemones2, pokemones3);
        String ganador1 = global_entrenador; Pokemon[] pkm1 = global_pokemones;  // Se guarda el ganador de #2 vs #3
        pelea(ganador0, ganador1, pkm0, pkm1);  // Pelea de (ganador #0 vs #1) vs (ganador #2 vs #3)
    }
    
    /*
     * Obtiene el índice del Pokémon dado su nombre.
     * 
     * @param nombre Nombre del tipo de Pokémon.
     * @return El índice correspondiente al tipo, o -1 si no se encuentra.
     */
    public static int indexOf(String nombre){
        for (int i = 0; i < 5; i++){
            if (tipos[i].nombre == nombre){
                return i;
            }
        }
        return -1;
    }

    /*
     * Método que mezcla aleatoriamente un arreglo de enteros.
     * 
     * @param array El arreglo de enteros que será mezclado.
     */
    private static void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            
            int index = random.nextInt(i + 1);
            // Swap array[i] with array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
       /* 
        * Simulacion de la pelea de los Pokemones
        * @param pokemones0 Son los pokemones del primer entrenador
        * @param pokemones1 Son los pokemones del segundo entrenador 
        * @param nombre0 Es el nombre del primer entrenador
        * @param nombre1 Es el nombre del segundo entrenador
       */
    public static void pelea(String nombre0, String nombre1, Pokemon[] pokemones0, Pokemon[] pokemones1){
        System.out.println("¡" + nombre0 + " ha retado a " + nombre1 + "!");
         //Selecciona  aleatoriamente de un pokemon  para cada entrenador 
        Pokemon pokemon0 = pokemones0[random.nextInt(6)];
        Pokemon pokemon1 = pokemones1[random.nextInt(6)];

        System.out.println(nombre0 + " ha seleccionado a " + pokemon0.nombre);
        System.out.println(nombre1 + " ha seleccionado a " + pokemon1.nombre);

        Pokemon[] pkms_pls = {pokemon0, pokemon1};
        
        String[] nmb_iterados = {nombre0, nombre1};
        Pokemon[][] pkm_iterados = {pokemones0, pokemones1};

        int iterador = 1;
        //Empieza el arreglo de los pokemones antes elegididos aleatoriamente 

        boolean peleando = true;
        //Esta determina el Estado de la pelea

        while(peleando){
            iterador = 1-iterador;
            //Cambia de entre dos entrenadores

            Pokemon pkm_pl_0 = pkms_pls[iterador];
            //Pokemon del jugador1
            Pokemon pkm_pl_1 = pkms_pls[1-iterador];
            //Pokemon del jugador2

            System.out.println(pkm_pl_0.nombre + " usa " + pkm_pl_0.ataque.nombre);

            // Saca un número aleatorio para que el ataque se dé en base a su probabilidad
            if (random.nextInt(0,100) < pkm_pl_0.ataque.probabilidad){  
                double multiplier = combate[indexOf(pkm_pl_0.ataque.tipo.nombre)][indexOf(pkm_pl_1.tipo.nombre)];
                if (multiplier == 2.0){ //Verifica la efectividad de cada ataque
                    System.out.println("¡Es super efectivo!");
                } //Si es  muy efectivo salta el "Es super efectivo"
                if (multiplier == 0.5){
                    System.out.println("No es muy efectivo");
                    //Si no es  muy efectivo salta el "No es muy efectivo"
                }
                pkm_pl_1.HP -= pkm_pl_0.ataque.poder * multiplier;
            } else {
                System.out.println(pokemon0.nombre + " falló el ataque");
            }

            if (pkm_pl_1.HP < 0){ //Verifica si la vida del pokemon siendo atacado es menor a 0
                peleando = false; // Se detiene la pelea
                global_entrenador = nmb_iterados[iterador]; // Se guardan el nombre y los pokemones del ganador
                global_pokemones = pkm_iterados[iterador];
            }
        };

        System.out.println("¡" + global_entrenador + " ha ganado!\n");  // Avisa quién ganó
    }

}
