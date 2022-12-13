
package java_collections_investigacion;

import java.util.Stack;
public class Stack_Pruevas {
    public static void main(String[] args) {
        Stack<String> CancionesHistoricas= new Stack<>();
    CancionesHistoricas.push("9 sinfonia ");
    CancionesHistoricas.push("yellow submarine");
    CancionesHistoricas.push("bohemean rapsody");
    CancionesHistoricas.push("tusa");
    CancionesHistoricas.push("Telepatia ");
    CancionesHistoricas.push("gatita ");
    
        System.out.println("la lista es "+CancionesHistoricas);
        System.out.println("La ultima cancion exito es "+CancionesHistoricas.peek());
        CancionesHistoricas.pop();
        System.out.println("SI no contamos gatita de bellakat queda:\n"
                + CancionesHistoricas);
    
    }
}
