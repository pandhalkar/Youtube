package JavaPractice;

class Animal {
	String breed;

	public String getbreed() {
		return breed;
	}

	public void setbreed(String breed) {
		this.breed = breed;
	}
	}

	class dog extends Animal {
		String bark;
		
		
		public String getbark()
		{
			return bark;
		}
		
		public void setbark(String bark)
		{
			this.bark=bark;
		}

	}

	public class FirstInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d=new dog();
		d.setbark("Bhow Bhow");
		
		d.setbreed("Labra");
		
		System.out.println(d.getbark());
		System.out.println(d.getbreed());
	}

}
