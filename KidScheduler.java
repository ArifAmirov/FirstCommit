
import santa.Kid;
import java.util.*;

public class KidScheduler {
	public static void main(String args[]) {
		ArrayList<Kid> kids = new ArrayList<>();
		ArrayList<Kid> kidsBefore = new ArrayList<>();
		ArrayList<Kid> kidsAfter = new ArrayList<>();
		
		//reading the data
		kids = readKids();
		
		for (int i=0; i<kids.size(); i++) {
			if (kids.get(i).getName().compareTo(kids.get(0).getName()) > 0) {
				kidsAfter.add(kids.get(i));
			} else {
				kidsBefore.add(kids.get(i));
			}
		}
		
		System.out.println("Kids before:");
		for (Kid kid: kidsBefore) {
			System.out.println(kid.getName());
		}
		
		System.out.println("Kids after:");
		for (Kid kid: kidsAfter) {
			System.out.println(kid.getName());
		}
		
		
	}
	
	public static ArrayList<Kid> readKids() {
		ArrayList<Kid> kids = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter info:");
		int n = sc.nextInt();
		for (int i=0; i< n; i++) {
			Kid kid = new Kid(sc.nextInt(), sc.next(),
					sc.next(), Boolean.parseBoolean(sc.next()));
			kids.add(kid);
		}
		return kids;
	}
}