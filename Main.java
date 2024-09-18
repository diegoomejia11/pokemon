import A.*;
import java.util.Random;

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

        Demian demian = new Demian();
        Axel axel = new Axel();
        Aldo aldo = new Aldo();
        Diego diego = new Diego();

        int[] array = {0, 1, 2, 3};
        shuffleArray(array);

        Pokemon[][] pokemones = {demian.pokemones, axel.pokemones, aldo.pokemones, diego.pokemones};
        String[] nombres = {"Demian", "Axel", "Aldo", "Diego"};

        System.out.println(nombres[array[0]] + " vs " + nombres[array[1]]);
        System.out.println(nombres[array[2]] + " vs " + nombres[array[3]]);

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

    private static void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i + 1);
            // Swap array[i] with array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

}