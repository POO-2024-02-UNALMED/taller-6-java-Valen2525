package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static ArrayList <Camioneta> listado = new ArrayList <Camioneta>();
    public Camioneta(String placa, int puertas, String nombre,long precio,int peso,String traccion, Fabricante fabricante,boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }
    public Camioneta(){super();}
    public boolean isVolco(){return this.volco;}
    public void setVolco(boolean vol){this.volco = vol;}
    public static int cantidadCamiones(){
        return listado.size();
    }
}