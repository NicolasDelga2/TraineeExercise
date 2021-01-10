
package Logica;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String [] args){
    
        Vehiculo peugeot = new Auto("Peugeot", "206", 200000.00, 4);
        Vehiculo peugeot1 = new Auto("Peugeot", "208", 250000.00, 5);
        
        Vehiculo moto = new Motocicleta("Honda", "Titan", 60000.00, "125cc");
        Vehiculo moto1 =  new Motocicleta("Yamaha", "YBR", 80500.50, "160cc");
        
        
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(peugeot);
        listaVehiculos.add(peugeot1);
        listaVehiculos.add(moto);
        listaVehiculos.add(moto1);
        
        
        System.out.println(Vehiculo.infoVehiculos(listaVehiculos));
        System.out.println(Vehiculo.masCaro(listaVehiculos));
        System.out.println(Vehiculo.masBarato(listaVehiculos));
        System.out.println(Vehiculo.contieneLetra('Y', listaVehiculos));
        System.out.println(Vehiculo.orderPorPrecio(listaVehiculos));
        
        
    }
    
}
