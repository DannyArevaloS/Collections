package EjemplosSet;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import modelo.Alumno;

public class EjemploTreeSetComparable {

	public static void main(String[] args) {
		
		Set<Alumno> sa = new TreeSet<>();
		sa.add(new Alumno("Patricio", 5));
		sa.add(new Alumno("Carolina", 6));
		sa.add(new Alumno("Daniel", 7));
		sa.add(new Alumno("Jose", 2));
		sa.add(new Alumno("Zeus", 10));
		
		System.out.println(sa);

	}

}
