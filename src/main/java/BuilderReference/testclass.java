package BuilderReference;

public class testclass {

	public static void main(String[] args) {
		Uber u=new Uber();
		u.login("gagan@gmail.com", "gagan1223")
		.search("honda", 5)
		.distance(50)
.startpoint("1989 ottawa", "n2e2e3")
.destination("235 willmonth", "n7h0h9")
.dopayment("1234 12345644546", 123)
.logout();
	}

}
