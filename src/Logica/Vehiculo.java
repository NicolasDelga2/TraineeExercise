package Logica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vehiculo {

    String marca;
    String modelo;
    double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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

    public static String infoVehiculos(List<Vehiculo> vehiculos) {
        String infoVehiculos = "";
        for (Vehiculo vehiculo : vehiculos) {
            infoVehiculos += vehiculo.toString();
        }
        return infoVehiculos;
    }

    public static String masCaro(List<Vehiculo> vehiculos) {
        String masCaro[] = new String[2];
        double precioMayor = 0;
        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPrecio() > precioMayor) {
                precioMayor = vehiculo.getPrecio();
                masCaro[0] = vehiculo.getMarca();
                masCaro[1] = vehiculo.getModelo();
            }
        }
        return "Vehiculo más caro: " + masCaro[0] + " " + masCaro[1];
    }

    public static String masBarato(List<Vehiculo> vehiculos) {
        String vehiculoBarato[] = new String[2];
        double precioMenor = 9999999999.00;

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPrecio() < precioMenor) {
                precioMenor = vehiculo.getPrecio();
                vehiculoBarato[0] = vehiculo.getMarca();
                vehiculoBarato[1] = vehiculo.getModelo();
            }
        }
        return "Vehiculo más barato: " + vehiculoBarato[0] + " " + vehiculoBarato[1];
    }

    public static String contieneLetra(char letra, List<Vehiculo> vehiculos) {
        String vehiculoLetra[] = new String[2];
        double precioVehiculo = 0;

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getModelo().indexOf(letra) != -1 ) {
                vehiculoLetra[0] = vehiculo.getMarca();
                vehiculoLetra[1] = vehiculo.getModelo();
                precioVehiculo = vehiculo.getPrecio();

            }
        }
        return "Vehiculo que contiene en el modelo la letra " + "‘" + letra + "’: "
                + "" + vehiculoLetra[0] + " " + vehiculoLetra[1] + " " + precioVehiculo + "\n";
    }

    public static String orderPorPrecio(List<Vehiculo> listaVehiculos) {
        String resultado = "Vehiculos ordenados por precio de mayor a menor: \n";
        Collections.sort(listaVehiculos, new CompararVehiculos());
        
        for(Vehiculo vehiculo :listaVehiculos){
            resultado += "Marca: " + vehiculo.getMarca() + " Modelo: " + vehiculo.getModelo() + "\n";
        }
        
        return resultado;
    }
}
