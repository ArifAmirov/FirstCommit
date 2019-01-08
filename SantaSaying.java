package santa;

public abstract class SantaSaying{
	//constructor
	public SantaSaying(){
		//empty
	}
	
	public static String hoHoHo(){
		return "Ho Ho Ho";
	}
	
	public String merryChristmas(String name){
		return "Merry Christmas dear " + name;
	}
}