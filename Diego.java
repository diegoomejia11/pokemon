import A.*;
public class Diego{
    public Pokemon[] pokemones = {
        new Pokemon ("Flareon", new Tipo("Fuego"), new Ataque("Lanzallamas", new Tipo ("Fuego"), 95,100), 65),
        new Pokemon("Moltres", new Tipo ("Fuego"), new Ataque ("Ala de Acero" , new Tipo ("Fuego"), 70, 100), 90),
        new Pokemon ("jolteon", new Tipo ("Electrico"), new Ataque ("Rayo", new Tipo ("Electrico"), 90, 100), 65),
        new Pokemon ("Magikarp", new Tipo ("Agua"), new Ataque("Salpicadura", new Tipo ("Agua"), 20, 100), 20),
        new Pokemon ("Articuno", new Tipo("Agua"), new Ataque("Ventisca", new Tipo("Agua"), 110, 70), 90),
        new Pokemon("Zapdos", new Tipo("Electrico"), new Ataque("Trueno", new Tipo ("Electrico"),110, 70), 90)
    };
    public static void main(String[]args){

    }
}
