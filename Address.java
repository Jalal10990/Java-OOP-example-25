public class Address{

private String street;
private String home;
private String city;

Address(){

}
Address(String s, String h, String c){

street = s;
home = h;
city = c;

}
void display(){
    System.out.println("House No"+ home + " Street No" + street + "City" + city);
}
public static void main(String[] args) {
        
    Address A = new Address("2-AZ", "25", "Sahiwal");
    A.display();

    Person P = new Person("Jalal", A);
    P.Display();
}
}

// person class 
 class Person {
    String name;
    Address ad;

    Person(){

    }
    Person(String n, Address a){

    name= n;
    ad= a;
    }

    void Display(){

        System.out.println("name " + name);
        ad.display();
    }
    
}
    
