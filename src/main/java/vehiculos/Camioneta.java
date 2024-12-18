package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static ArrayList <Camioneta> listado = new ArrayList <Camioneta>();
    public Camioneta(String placa, int puertas, String nombre,long precio,int peso,String traccion, Fabricante fabricante,boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        listado.add(this); }

    public Camioneta(String placa, int puertas, String nombre, long precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante); 
        this.volco = volco;
        listado.add(this); }

    public Camioneta(){super();}

    public boolean isVolco(){return this.volco;}
    public void setVolco(boolean vol){this.volco = vol;}
    public String getTraccion() {
        return super.getTraccion();}
    public long getVelocidadMaxima() {
        return super.getVelocidadMaxima();}
    public Fabricante getFabricante() {
        return super.getFabricante();}
    public static int cantidadCamionetas(){
        return listado.size();
    }
    public static ArrayList <Camioneta> getListado(){
        return listado;
    }
    
}
