package cl.dmiranda;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Caso1 {

	public static void main(String[] args) {

		ArrayList<String> marcas = new ArrayList<>();

		// listado
		System.out.println("---- Listado CASO 1----");
		marcas.add("Nike");
		marcas.add("Reebok");
		marcas.add("Convers");
		marcas.add("Levis");
		marcas.add("Puma");
		marcas.add("Skechers");
		marcas.add("7UP");
		marcas.add("Fila");
		marcas.add("Vans");
		marcas.add("Blobaster");
		marcas.add("Americanino");
		System.out.println(marcas.toString());
		System.out.println();

		// 3 nuevas marcas
		System.out.println("Se agrega: ");
		marcas.add("Blockbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		System.out.println(marcas.toString());
		System.out.println();

		//corrige		
		System.out.println("Corrige: ");
		int indexBlobaster = marcas.indexOf("Blobaster");
        if (indexBlobaster != -1) {
            marcas.set(indexBlobaster, "Blockbuster");
            System.out.println();
        }
		 
		// corregirCod - remover "Carrefour"
		boolean removido = marcas.remove("Carrefour");
		System.out.println("Se eliminó Carrefour de la lista " + removido);
		System.out.println();
		
		// imprimir nuevo listado
				System.out.println("Nuevo listado: ");
				for (Iterator<String> iterator = marcas.iterator(); iterator.hasNext();) {
					System.out.println(marcas);
					System.out.println();
				}
		
		// cant marcas
		int cantMarcas = marcas.size();
		System.out.println("La cant. de Marcas es: " + cantMarcas);
		System.out.println();

		/*// CASO2
		Set<String> invitados = new TreeSet<>();
		{
			// invitados
			System.out.println("---- Listado CASO 2----");
			System.out.println("Listado invitados: ");
			invitados.add("Daniel");
			invitados.add("Paola");
			invitados.add("Facundo");
			invitados.add("Pedro");
			invitados.add("Jacinta");
			invitados.add("Florencia");
			invitados.add("Juan Pablo");
			System.out.println(invitados.toString());
			System.out.println();
		}

		// posibles invitados
		Set<String> posiblesInvitados = new TreeSet<>();
		System.out.println("Se une a la fiesta: ");
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		System.out.println(posiblesInvitados.toString());
		System.out.println();

		// unificar listados
		System.out.println("El listado final es: ");
		invitados.addAll(posiblesInvitados);
		System.out.println(invitados.toString());
		System.out.println();

		// eliminar Jorge
		System.out.println("Es mejor invitar a: ");
		posiblesInvitados.remove("Jorge");
		System.out.println(posiblesInvitados.toString());
		System.out.println();

		// CASO 3
		Map<String, Integer> dulces = new TreeMap<>();
		dulces.put("Chocman", 100);
		dulces.put("Trululú", 100);
		dulces.put("Centella", 100);
		dulces.put("Kilate", 50);
		dulces.put("Miti-miti", 30);
		dulces.put("Traga-Traga", 150);
		dulces.put("Tabletón", 5);*/

	}

}
