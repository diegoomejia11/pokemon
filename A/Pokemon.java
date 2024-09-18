package A;

public class Pokemon{
    public String nombre;
    public Tipo tipo;
    public Ataque ataque;

    public int HP;

    public Pokemon(String nombre, Tipo tipo, Ataque ataque, int HP){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.HP = HP;
    }
}