package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;

public class StreamAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>alist=Arrays.asList("Lalita", "Prabhas", "Deven", "Dabbu");
		ArrayList <String>flist=new ArrayList<String>();
		flist.add("Jam");
		flist.add("Ham");
		flist.add("dabbu");

		
		Stream <String>MyNewArrayList=Stream.concat(alist.stream(), flist.stream());

		//MyNewArrayList.sorted().map(u->u.toUpperCase()).forEach(u->System.out.println(u));
	boolean flag=	MyNewArrayList.anyMatch(y->y.equalsIgnoreCase("Dabbu"));
	System.out.println(flag);
	Assert.assertTrue(flag);
		
	}

}
