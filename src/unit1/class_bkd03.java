package unit1;

public class class_bkd03 {
    String firstName;
    String lastName;
    int age;
    public class_bkd03() {
    	
    }
    
    public class_bkd03( String firstName, String lastName, int age) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    }
    public void thongtinchitiet() {
    	System.out.println("class_bkd03 [firstName=" + firstName +", lastName=" + lastName +", age=" + age +"]");
    }
}
