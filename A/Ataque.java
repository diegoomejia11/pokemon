package A;

public class Ataque{
    public String nombre;
    public Tipo tipo;

    public int poder;
    public int probabilidad;

    public Ataque(String nombre, Tipo tipo, int poder, int probabilidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
        this.probabilidad = probabilidad;
    }
}

