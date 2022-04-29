package ProblemStatement3.ProblemStatement3_2;

public class MedicineInfo {
	public void displayLabel()
	{
	System.out.println("Company : MediPlus Pharma");
	System.out.println("Address : Hyderbad");
	}
	}
	class Tablet extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("store in a cool dry place");
	}
	}
	class Syrup extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("Consumption as directed by the physician");
	}
	}
	class Ointment extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("for external use only");
	}

}
