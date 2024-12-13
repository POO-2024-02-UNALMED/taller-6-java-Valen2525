package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    public Pais(String nombre){
        this.nombre = nombre;}
    public Pais (){this(null);}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    static public Pais paisMasVendedor(){
        ArrayList <Pais> paises = new ArrayList <>();
        for(Camioneta camioneta : Camioneta.getListado()){
            paises.add(camioneta.getFabricante().getPais());
        }
        for(Automovil automovil : Automovil.getListado()){
            paises.add(automovil.getFabricante().getPais());
        }
        for(Camion camion : Camion.getListado()){
            paises.add(camion.getFabricante().getPais());
        }
        Pais paisMasvendedor = null;
        int repeticiones = 0;
        for(Pais pais : paises){
            Pais elementoActual = pais;
            int contador = 0;
            for(int j = 0; j < paises.size(); j++) {
                if (pais == elementoActual){
                    contador ++;}
            }
            if (contador > repeticiones){
                paisMasvendedor = elementoActual;
            }
        }
        return paisMasvendedor;
    }
}
