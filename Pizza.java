public class Pizza{
	// CONSTATNS
	public static final int SMALL_DIAM = 9;
	public static final int MEDIUM_DIAM = 12;
	public static final int LARGE_DIAM = 16;
	public static final int XL_DIAM = 18;
	
	// ENUMERATED TYPES
	public enum PizzaType {CHEESE, PEPPERONI, VEGGIE};
	public enum PizzaSize {SMALL, MEDIUM, LARGE, XL};
	
	// PRIVATE DATA
	private PizzaType type;
	private PizzaSize size;
	private boolean thinCrust;
	private String specInstruct;
	
	// Constructor for the objects of class Pizza
	public Pizza(PizzaType type, PizzaSize size, boolean thinCrust, String specInstruct){
		this.type = type;
		this.size = size;
		this.thinCrust = thinCrust;
		this.specInstruct = specInstruct;	
	}
	public Pizza(PizzaType type, PizzaSize size){
		this(type, size, false, "");
	}
	public Pizza(){
		this(PizzaType.VEGGIE, PizzaSize.LARGE);
	}
	
	// ACCESSORS 
	public PizzaType getType(){
		return type;
	}
	
	public PizzaSize getSize(){
		return size;
	}
	
	public boolean getThinCrust(){
		return thinCrust;
	}
	
	public String getSpecInstruct(){
		return specInstruct;
	}
	
	public double getArea(){
		double diameter, Area;
		if (size == PizzaSize.SMALL) diameter= SMALL_DIAM;
		else if (size == PizzaSize.MEDIUM) diameter = MEDIUM_DIAM;
		else if (size == PizzaSize.LARGE)  diameter = LARGE_DIAM;
		else 										  diameter = XL_DIAM;
		
		return Math.pow(diameter/2.0, 2) * 3.1415;
	}
	
	// MUTATORS
	public void setType(PizzaType type){
		this.type = type;
	}
	public void setSize(PizzaSize size){
		this.size = size;
	}
	public void setThinCrust(boolean thinCrust){
		this.thinCrust = thinCrust;
	}
	public void setSpecInstruct(String specInstruct){
		this.specInstruct = specInstruct;
	}
	
	// ToString Methos: String representations of the Object
	public String toString(){
		String result = "";
		result += "Pizza Type: " + type + "\n";
		result += "Pizza Size: " + size + "\n";
		result += "Pizza ThinCrust: " + (thinCrust ? "Yes" : "NO") + "\n";
		result += "Pizza special Instruction: " + specInstruct + "\n";
		
		return result;
	}
}