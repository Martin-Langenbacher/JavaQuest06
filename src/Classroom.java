
public class Classroom {

	public static void main(String[] args) {
		
	Wilder marcel = new Wilder("Marcel", false);
	
	Wilder stefi = new Wilder("Stefi", false);
	
	Wilder martin = new Wilder("Martin", true);
	
	Wilder frank = new Wilder("Frank", true);
	
	Wilder arne = new Wilder("Arne", true);
	
	
	frank.setPresent(false);
	
	
	System.out.println(marcel.whoAmI());
	System.out.println(stefi.whoAmI());
	System.out.println(martin.whoAmI());
	System.out.println(frank.whoAmI());
	System.out.println(arne.whoAmI());
		
	}	
		
}






