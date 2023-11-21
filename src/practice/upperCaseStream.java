package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;

public class upperCaseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string end with a , convert it into upper case

	Stream.of("Rama", "Shayma", "Laxman").filter(n->n.endsWith("a")).map(n->n.toUpperCase())
	.forEach(n->System.out.println(n));
		
//		//all upper case letter
//		Stream.of("Lalita", "Prabhas", "Deven").map(w->w.toUpperCase())
//		.forEach(w->System.out.println(w));
		
		List <String> alist=Arrays.asList("Lalita", "Prabhas", "Deven", "Dabbu");
		alist.stream().filter(h->h.startsWith("D")).sorted().map(h->h.toLowerCase())
		.forEach(h->System.out.println(h));
		ArrayList<String> newarray=new ArrayList<String>();
		newarray.add("lalita");
		newarray.add("Naisha");
		newarray.add("Simba");
		Stream <String> myNewString=Stream.concat(newarray.stream(), alist.stream());
		myNewString.sorted().map(l->l.toUpperCase()).forEach(l->System.out.println(l));
	
	
	
	}

}
