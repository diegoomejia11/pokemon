import A.*;
public class Diego{
    public Pokemon[] pokemones = {
        new Pokemon ("Flareon", new Tipo("fuego"), new Ataque("Lanzallamas", new Tipo ("fuego"), 95,100), 65),
        new Pokemon("Moltres", new Tipo ("fuego"), new Ataque ("Ala de Acero" , new Tipo ("fuego"), 70, 100), 90),
        new Pokemon ("jolteon", new Tipo ("electrico"), new Ataque ("Rayo", new Tipo ("electrico"), 90, 100), 65),
        new Pokemon ("Magikarp", new Tipo ("agua"), new Ataque("Salpicadura", new Tipo ("agua"), 20, 100), 20),
        new Pokemon ("Articuno", new Tipo("agua"), new Ataque("Ventisca", new Tipo("agua"), 110, 70), 90),
        new Pokemon("Zapdos", new Tipo("electrico"), new Ataque("Trueno", new Tipo ("electrico"),110, 70), 90)
    };
    public static void main(String[]args){

    }
}
