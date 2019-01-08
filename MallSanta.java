package santa;


public class MallSanta extends SantaSaying{
	private Kid kid;
	private String mallName;
	
	//constructor 
	
	public MallSanta (Kid kid ,String mallName){
		this.mallName = mallName;
		this.kid = kid;
	}
	
	//getters 
	public Kid getKid(){
		return kid;
	}
	
	public String getMallName(){
		return mallName;
	}
	
	//setters
	public void setKid(Kid kid){
		this.kid = kid;
	}
	
	public void setMallName(String mallName){
		this.mallName = mallName;
	}
	
	@Override 
	public String merryChristmas(String name){
		return super.merryChristmas(name) + ", enjoy shopping with " + mallName;
	} 
	
	
	public String merryChristmas(){
		return this.merryChristmas(kid.getName());
	}
}