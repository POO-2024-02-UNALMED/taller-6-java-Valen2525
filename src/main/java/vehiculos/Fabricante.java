package vehiculos;

public class Fabricante {
    private String nombreFabricante;
    private Pais pais;

    public Fabricante(String nombre, Pais pais){
        this.nombreFabricante = nombre;
        this.pais = pais;
    }
    public Fabricante(){this(null, null);}
    public String getNombreFabricante(){ return this.nombreFabricante;}
    public void setNombreFabricante(String nombre){ this.nombreFabricante = nombre;}
    public Pais getPais(){ return this.pais;}
    public void setPais(Pais pais){ this.pais = pais;}
}
