package santa;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SantaDelivery extends SantaSaying {
	private Kid kid;
	private Date deliveryTime;
	private String address;
	
	private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
	
	//getters
	public Kid getKid(){
		return kid;
	}
	
	public Date getDeliveryTime(){
		return deliveryTime;
	}
	
	public String getAddress(){
		return address;
	}
	
	//setters
	public void setKid(Kid kid){
		this.kid = kid;
	}
	
	public void setDeliveryTime(Date deliveryTime){
		this.deliveryTime = deliveryTime;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	//constructor
	
	public SantaDelivery(Kid kid, String deliveryTime, String address){
		this.kid = kid;
		try {
			this.deliveryTime = timeFormat.parse(deliveryTime);
		} catch (java.text.ParseException e){
		}
		this.address = address;
		
	}
	
	public static String hoHoHo(){
		return "Ho Ho Ho, the traffic is crazy today";
	}
	
	@Override
	public String toString(){
		if(kid.getGoodkid()){
			return "Delivery to " + address + " for " + kid.getName() + "("+ kid.getAge() +"," + kid.getGender() + ")" +  " at " + timeFormat.format(deliveryTime); 
		} else {
			return "No delivery for " + kid.getName() + ", because he was bad";
		}
	}
	
	
	
	
	
}