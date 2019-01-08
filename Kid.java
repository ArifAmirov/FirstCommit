package santa;

public class Kid {
	private int yearofbirth;
	private String name;
	private String gender;
	private boolean goodkid;

//constructor

public Kid(int yearofbirth, String name, String gender, boolean goodkid){
	this.yearofbirth = yearofbirth;
	this.name = name;
	this.gender = gender;
	this.goodkid = goodkid;
} 

 public boolean equals (Kid kid){
	if(this.yearofbirth == kid.getYearofbirth() &&
		this.name == kid.getName()&&
		this.gender == kid.getGender())
		return true;
	else 
		return false;
}

public int getAge(){
	return 2017 - yearofbirth;
}

//getters
public int getYearofbirth(){
	return yearofbirth;
}

public String getName(){
	return name;
}

public String getGender(){
	return gender;
}

public boolean getGoodkid(){
	return goodkid;
}

//setters
public void setYearofbirth(int yearofbirth){
	this.yearofbirth = yearofbirth;
}

public void setName(String name){
	this.name = name;
}

public void setGender(String gender){
	this.gender = gender;
}

public void setGoodkid(boolean goodkid){
	this.goodkid = goodkid;
}

}