package OOP_InterfaceConcept;

public class TestHospital {
	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.pediaServices();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.oncologyServices();
		fh.optServices();
		fh.medicalRD();
		fh.covidVac();
		System.out.println("-------------");
		//USMedical us= new USMedical();
		
	//topcasting
		
	USMedical us= new FortisHospital();
	us.dentalServices();
	us.emergencyServices();
	us.entServices();
	us.orthoServices();
	us.physioServices();
	us.covidVac();
	
	//Inteface to interface
	USMedical usa= new FortisHospital();
	
	UKMedical uk= (UKMedical)(usa);
	uk.oncologyServices();
	uk.pediaServices(); 
	usa.dentalServices();
	
	}
}
