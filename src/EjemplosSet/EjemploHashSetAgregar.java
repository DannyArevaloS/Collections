package EjemplosSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("cinco");
		System.out.println(hs);
		
		boolean b = hs.add("tres");
		String resultados = "";
		if(b == false) {
			resultados = "No";
		} else {
			resultados = "Si";
		}
		System.out.println("Permite elementos duplicados: " + resultados);
		
		List<String> lista = new ArrayList<>(hs);
		Collections.sort(lista);
		System.out.println(lista);
		
	}

}
