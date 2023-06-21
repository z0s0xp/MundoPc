
package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.DispositivoEntrada;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;
import javax.management.monitor.CounterMonitor;

/**
 *
 * @author z0s0xp
 */
public class MundoPC {
    
    public static void main(String[] args) {
       // DispositivoEntrada ds=new DispositivoEntrada("USB","Logi");
        Raton r=new Raton("USB","Logi");
        Teclado t=new Teclado("USB", "HP");
        Monitor m=new Monitor("Dell", 23.0);
        Computadora c=new Computadora("Alien", m, t, r);
        Orden or=new Orden();
        or.agregarComputadora(c);
        or.mostrarOrden();
        
    }
    
}
