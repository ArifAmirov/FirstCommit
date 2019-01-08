package santa.main;
import santa.*;
import java.util.Date;
import java.util.Scanner;

public class MerryChristmas {
	public static void main(String args[]){
		
		
		Kid kid1 = new Kid( 2016, "Josh", "MALE", true );
		Kid kid2 = new Kid( 2016, "Amanda", "MALE", true );
		Kid kid3 = new Kid( 2016, "Robert", "MALE", false );
		
		System.out.println(SantaSaying.hoHoHo());
		MallSanta mallSanta1 = new MallSanta(kid1, "TescoMall");
		System.out.println(mallSanta1.merryChristmas());
		mallSanta1.setKid(kid2);
		System.out.println(mallSanta1.merryChristmas());
		MallSanta mallSanta2 = new MallSanta(kid3, "Allee");
		System.out.println(mallSanta2.merryChristmas());
		
		//3
		SantaDelivery santadelivery = new SantaDelivery( kid1, "15:00", "Pazmany Peter setany");
		System.out.println(santadelivery.toString());
		
		santadelivery.setKid(kid2);
		santadelivery.setDeliveryTime(new Date());
		santadelivery.setAddress("Deak ter");
		System.out.println(santadelivery.toString());
		
		santadelivery.setKid(kid3);
		System.out.println(santadelivery.toString());
		
		
		//4
		System.out.println("Please write your kid's data; Year of Birth, Name, Gender and How good the kid is (true or false");
		Scanner sc = new Scanner(System.in);
		Kid kid4 = new Kid(sc.nextInt(), sc.next(), sc.next(), Boolean.parseBoolean(sc.next()));	
		
		System.out.println("Please write the other kid's data; Year of Birth, Name, Gender and How good the kid is (true or false");
		Kid kid5 = new Kid(sc.nextInt(), sc.next(), sc.next(), Boolean.parseBoolean(sc.next()));
		if(kid4.equals(kid5)){
			System.out.println("These 2 kids are the same");
		} else {
			System.out.println("These 2 kids are not the same");
		}
		
	}
}