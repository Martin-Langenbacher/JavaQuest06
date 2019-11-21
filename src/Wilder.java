public class Wilder {

	// attributes
	private String firstname;
	private boolean present;
	
	// constructor
	public Wilder(String firstname, boolean present) {
		this.firstname = firstname;
		this.present = present;
	}
	// getters
	public String getFirstname() {
		return this.firstname;
	}
	
	public boolean isPresent() {
		return this.present;
	}
	
	// setters
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	
	

	
	// Method --> whoAmI:
	public String whoAmI() {
		String textString;
		if (this.isPresent()) {
			//present...
			textString = "My name is " +this.getFirstname() +" and I am present.";
		} else {
			//not present...
			textString = "My name is " +this.getFirstname() +" and I am not present.";
		}
		return (textString);
	}
	
}










/*
 public class Duck {

    // attributs
    private String name;
    private int age;
    private boolean swimming;

    // constructeurs
    public Duck(String name) {
        this.name = name;
        this.age = 0;
        this.swimming = false;
    }

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        this.swimming = false;
    }

    // méthode statique
    public static String quack() {
        return "Quack!";
    }

    // méthode instanciée
    public String nameAndAge() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }
    
    // accesseurs (getters)
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isSwimming() {
        return this.swimming;
    }
    
    // mutateurs (setters)
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }
}
 */
