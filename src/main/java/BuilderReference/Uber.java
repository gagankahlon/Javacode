package BuilderReference;

public class Uber {

	public Uber login()

	{
		System.out.println("login page");
		return this;
	}
	
	public Uber login(String username,String password)
	{
		System.out.println("login with"+username +":"+password);
		return this;
	}
	
	public Uber login(String username,String password,String otp)
	{
		System.out.println("login with"+username+":"+password+":"+otp);
		return this;
	
	}
			
public Uber search()
{
	System.out.println("search ");
	return this;
}
public Uber distance(int km)
{
	System.out.println("total distance"+":"+km);
	return this;
}
public Uber search(String car ,int rating)
{
	System.out.println(car+":"+rating);
	return this;
}
public Uber startpoint(String street,String postalcode)
{
	System.out.println(street+":"+postalcode);
	return this;
	}
public Uber destination(String street,String postalcode)
{
	System.out.println(street+":"+postalcode);
	return this;
}
public Uber selectcar(String car)
{
	System.out.println("select car"+":"+car);
}
public Uber dopayment(String cc,int cvv)
{
	System.out.println(cc+":"+cvv);
	return this;
}
public Uber tripstart(String start)
{
	System.out.println("tripstart"+":"+start);
	return this;
	}
	
public Uber tripstop(String stop)
{
	System.out.println("tripended"+":"+stop);
	return this;
}
public Uber logout()
{
	System.out.println("App logout");
	return this;
	
}
	
}




