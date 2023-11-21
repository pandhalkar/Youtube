package practice;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> name = new ArrayList<String>();
	        name.add("AAshlesha");
	        name.add("Amol");
	        name.add("Anu");
	        name.add("Deven");
	        name.add("Lalita");
	        
	    Long g=    name.stream().filter(d->d.startsWith("A")).count();
	    System.out.println(g);
	    
	    name.stream().filter(e->e.length()>6).forEach(e->System.out.println("new " + e));
	}

}



