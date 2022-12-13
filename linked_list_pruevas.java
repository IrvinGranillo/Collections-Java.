package java_collections_investigacion;

import java.util.LinkedList;

public class linked_list_pruevas {

    public static void main(String[] args) {

        LinkedList<String> fechas = new LinkedList<>();
        fechas.add("junio 1988");
        fechas.addFirst("enero 1972");
        fechas.addFirst("Agosto  1972");
        fechas.addLast("ahora");
        fechas.addFirst("Diciembre 1971");
        fechas.addFirst("Diciembre 1970");
        fechas.addFirst("Diciembre 1969");
        fechas.addLast("mañana");
        fechas.add(5, "Mayo 1988");
        fechas.add(4, "mayo 2002");
        
        System.out.println("El tamaño es "+fechas.size());
        
        System.out.println(fechas);
        fechas.remove("Diciembre 1969");
        fechas.removeFirst();
        fechas.removeLast();
        System.out.println(fechas);
    }

}
