
package com.gm.mundopc;

/**
 *
 * @author z0s0xp
 */
public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static int maxComputadoras=10;
    
    
    public Orden(){

        this.idOrden=++contadorOrdenes;
        this.computadoras= new Computadora[Orden.maxComputadoras];
}
    
    public void agregarComputadora(Computadora computdora){
        if (this.contadorComputadoras< Orden.maxComputadoras) {
            this.computadoras[this.contadorComputadoras++]= computdora;
        }else{
        
            System.out.println("Se a superado el maxiom de computadoras");
        
        }
    
    }
    
    public void mostrarOrden(){
        System.out.println("El Id de la oden es : "+ this.idOrden);
        
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    
    
    }
}


