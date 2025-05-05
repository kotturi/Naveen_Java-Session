package OOP_InterfaceConcept;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndiaMedical{


	//US
	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
	}

	@Override
	public void entServices() {
		System.out.println("FH---entServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
	}	

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");			
	}	
//	@Override
//	public int test(int i) {
//		return 0;
//	}

	//UK
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");		
	}
	

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");		
	}

	//India
	@Override
	public void radioServices() {
		System.out.println("FH---radioServices");			
	}

	@Override
	public void opticalServices() {
		System.out.println("FH---opticalServices");			
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");			
	}

	//common
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencyServices");			
	}
	
	//Individual 
	
	public void medicalTraining()
	{
		System.out.println("FH---medicalTraining");	
	}
	public void optServices()
	{
		System.out.println("FH---optServices");	
	}
//WHO
	@Override
	public void covidVac() {
		System.out.println("FH---covidVac(WHO)");			
	}
	

	


}
