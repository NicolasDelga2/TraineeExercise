
package Logica;

public class Motocicleta extends Vehiculo{
    
    private String cilindrada;
    
    
    
    public Motocicleta(String marca, String modelo, double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // Precio: " + precio + "\n";
    }
    
   
    
    
    
}
