package JavaPractice;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

public class upperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Lalita Rajput";
		
		System.out.println("Length: " +name.length());
		
		System.out.println("Upper Case: "+ name.toUpperCase());
		
		System.out.println("Lower Case: "+ name.toLowerCase());
		
		System.out.println("Sub String: "+ name.substring(3));
		
		System.out.println("Sub String begin and end: "+ name.subSequence(2, 6));
		
		System.out.println("REplace:------" + name.replace(" ", "_"));
		
		System.out.println("Replace All:" + name.replaceFirst("Lalita", "Naisha"));
		
		System.out.println("Start with: "+ name.startsWith("L"));
		
		System.out.println("End With: "+ name.endsWith("a"));
		
		System.out.println("Charrector at: " +name.charAt(3));
		
		System.out.println("Index of:" + name.indexOf(2));
		
		System.out.println("Last Index of:" + name.lastIndexOf("i"));
		                            
		
		
		
		
		
		

	}

}
