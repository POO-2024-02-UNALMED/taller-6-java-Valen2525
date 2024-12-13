package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private int puestos;
    private static ArrayList <Automovil> listado = new ArrayList <Automovil>();
    public Automovil(String placa,String nombre,long precio,int peso,String traccion, Fabricante fabricante, int puestos){
        super(placa, 4, 100,nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        listado.add(this);
    }
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante); 
        this.puestos = puestos;
        listado.add(this); }

    public Automovil(){super();}

    public int getPuestos(){
        return this.puestos;}
    public void setPuestos(int puestos){
        this.puestos = puestos;} 

    public static int cantidadAutomoviles(){
        return listado.size();
    }
}
