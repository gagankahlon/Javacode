package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


	
public class Assignment {
	
	
		// TODO Auto-generated method stub

		public String doSearch(String name)
		{
System.out.println("enter the name");
return name;
}
		public static void main(String a[]) {
		
	ArrayList<String> browser=new ArrayList<String>();
	
	browser.add("Chrome");
    browser.add("firefox");
	browser.add("IE");
	browser.add("Safari");
	browser.add("Ms edge");
	
Switch (browser) {

	



	Case(browser.equals("Chrome"));
	{
		System.out.println("Launch chrome");
		break;
	
		
	}
	
	case(browser.equals("IE"))
	
	{
		System.out.println("Launch IE");
		break;
		}
	
Case (browser.equals("Safari"))
		{
			System.out.println("Launch Safari");
			break;
		}
	case (browser.equals("Ms Edge"))
		{
			System.out.println("Launch Ms Edge");
			break;
		}
	case (browser.equals("firefox"))
		{
			System.out.println("Launch firefox");
			break;
		}
	default
		{
			System.out.println("Please enter valid brower name");
			
		break;
		}
	Assignment obj=new Assignment();
	
String f=obj.doSearch("tap");
{ System.out.println(f);

}
	}}