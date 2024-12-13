package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    private String placa;
    private int puertas;
    private long velocidadMaxima;
    private String nombre;
    private long precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, long velocidadMaxima, String nombre,long precio,int peso,String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos ++;
    }
    public Vehiculo(){this(null, 0, 0, null, 0, 0, null, null);}

    public String vehiculosPorTipo(){
        return "Automoviles:: " + Automovil.cantidadAutomoviles() + "\n" +
                "Camionetas: " + Camioneta.cantidadCamionetas() + "\n" +
                "Camion: " + Camion.cantidadCamiones() + "\n";
    }

    public Pais paisMasvendedor(){
        ArrayList <Pais> listado = new ArrayList <>();
        for(Camioneta camioneta : listado){

        }
    }

    public String getPlaca() {
        return placa;}
    public void setPlaca(String placa) {
        this.placa = placa;}

    public int getPuertas() {
        return puertas;}
    public void setPuertas(int puertas) {
        this.puertas = puertas;}

    public long getVelocidadMaxima() {
        return velocidadMaxima;}
    public void setVelocidadMaxima(long velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;}

    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public long getPrecio() {
        return precio;}
    public void setPrecio(long precio) {
        this.precio = precio;}

    public int getPeso() {
        return peso;}
    public void setPeso(int peso) {
        this.peso = peso;}

    public String getTraccion() {
        return traccion;}
    public void setTraccion(String traccion) {
        this.traccion = traccion;}

    public Fabricante getFabricante() {
        return fabricante;}
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;}

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;}
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;}

}
