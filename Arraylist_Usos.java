
package java_collections_investigacion;

import java.util.ArrayList;
public class Arraylist_Usos {
    public static void main(String[] args) {
        ArrayList nombres=new ArrayList();
     
        nombres.add("Maria ");
        nombres.add("Morelos");
        nombres.add("Luise");
        nombres.add("Jatziri    ");
        nombres.add("Pedro");
        nombres.add("Pablo");
        System.out.println(nombres);
        System.out.println("cambiando nombre 2");
        nombres.set(2, "Luisa");
        nombres.remove("Pablo");
        // sustituye a luisa 
        System.out.println(nombres);
        System.out.println("*se limpia ");
        nombres.clear();
        System.out.println("Tamanio actual es "+  nombres.size());
    }
    
}
