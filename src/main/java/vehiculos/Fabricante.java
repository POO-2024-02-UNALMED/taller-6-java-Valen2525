package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    public Fabricante(){this(null, null);}
    public String getNombre(){ return this.nombre;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public Pais getPais(){ return this.pais;}
    public void setPais(Pais pais){ this.pais = pais;}

    static public Fabricante fabricaMayorVentas(){
        ArrayList <Fabricante> fabricantes = new ArrayList <>();
        for(Camioneta camioneta : Camioneta.getListado()){
            fabricantes.add(camioneta.getFabricante());
        }
        for(Automovil automovil : Automovil.getListado()){
            fabricantes.add(automovil.getFabricante());
        }
        for(Camion camion : Camion.getListado()){
            fabricantes.add(camion.getFabricante());
        }
        Fabricante fabricaMayorVentas = null;
        int repeticiones = 0;
        for(Fabricante fabricante : fabricantes){
            int contador = 0;
            Fabricante elementoActual = fabricante;
            for (Fabricante fabricanteComparar : fabricantes){
                if(elementoActual.equals(fabricanteComparar)){
                    contador++;
                }
            }
            if (contador > repeticiones){
                fabricaMayorVentas = elementoActual;
                repeticiones = contador;
            }
        }
        return fabricaMayorVentas;
    }
}
