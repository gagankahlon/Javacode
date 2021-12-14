package Constructor;

public class Testclass {

	public static void main(String[] args) {
		
		RegistrationPage p=new RegistrationPage("tom","cruze","tomcruze@gmail.com",51923065,"admin","admin");
		
System.out.println(p.getFirstname());

System.out.println(p.getLastname());
System.out.println(p.getEmail());
System.out.println(p.getPhone());
System.out.println(p.getPassword());
System.out.println(p.getConfirmpassword());

p.setLastname("Peter");
System.out.println(p.getFirstname());
System.out.println(p.getLastname());
System.out.println(p.getEmail());
System.out.println(p.getPhone());
System.out.println(p.getPassword());
System.out.println(p.getConfirmpassword());

	}
	

}
