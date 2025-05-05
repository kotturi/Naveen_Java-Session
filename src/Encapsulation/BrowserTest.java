package Encapsulation;

public class BrowserTest {

	public static void main(String[] args) {
 
		Browser br= new Browser();
		br.launchBroswer();
		
		//Util u= new Util(); //Constructor is private
		Util.checkVersion();
		//System.getProperties()
		
	}

}
