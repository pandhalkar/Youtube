package practice;

import java.util.stream.Stream;

public class SngleLineSteadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long f=Stream.of("AAm", "AAP", "Sam" , "Ram").filter(d->d.startsWith("A")).count();
		System.out.println(f);
	

	}

}
