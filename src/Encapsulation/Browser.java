package Encapsulation;

public class Browser {

	public void launchBroswer()
	{
		System.out.println("launch Broswer");
		checkVersion();
		checkRAM();
		checkLatestUpdates();
		checkOSCompatibility();
		System.out.println("Broswer Launched");
	}
	private void checkVersion()
	{
		System.out.println("checkVersion");
	}
	private void checkRAM()
	{
		System.out.println("checkRAM");
	}
	private void checkLatestUpdates()
	{
		System.out.println("checkLatestUpdates");
	}
	private void checkOSCompatibility()
	{
		System.out.println("checkOSCompatibility");
	}
	

}
