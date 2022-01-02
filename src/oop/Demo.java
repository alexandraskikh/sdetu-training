package oop;


class Person {
	
	 String name;
	  String email;
	  String phone;
	  
	void walk () {
		System.out.println(name + " is walking");
	}
	
void talk () {
	System.out.println(phone + " is talking");
	}

void sleep () {
	System.out.println(email + " is emailing");
}

}

public class Demo {

	public static void main(String[] args) {
	
		
		Person person1= new Person ();
		person1.email = "2323@.com";
		person1.phone = "234243234";
		person1.name = "FuckYou";
		
		person1.walk();
		person1.talk();
		person1.sleep();
		
	
 /* String name= "Joe";
  String email ="joe@email.com";
  String phone ="2323232";
  
  walking (name);
  System.out.println(name + " is talking");
  
  
  String name2= "Katrin";
  String email2 ="kate@email.com";
  String phone2 ="2323232";
  
  walking (name2);
  System.out.println(name2 + " is talking");
	}

	
	static void walking (String name) {
		System.out.println(name + " is walking");
	
	} */
	
	
	}
}
