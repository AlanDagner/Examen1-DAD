package pregunta3;
import pregunta3.Cola;

public class Productor implements Runnable{
        Cola colaCompartida;
        public Productor(Cola cola){
                this.colaCompartida=cola;
        }
        public void run() {
            System.out.println("Productor encoló el numero:");
           /*while (true){
                   int num=(10);
                   while (colaCompartida.encolar(num)!=false){
                   } /*Fin del while*/

                //   System.out.println("Productor encoló el numero:"+num);/*
           } /*Fin del while externo*/
        } /*Fin de run()*/
//} /*Fin de la clase*/
