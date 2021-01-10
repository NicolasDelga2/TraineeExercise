
package Logica;

public class Auto extends Vehiculo{
    
    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
      @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: " + precio + "\n";
    }
    
}
