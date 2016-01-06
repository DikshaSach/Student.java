
public class Student{
	private static int NumberOfStudents = 0;
	

		private String firstName;
		private String lastName;
		private String cunyID;
		private String gpa;
		
		
		public static int GetNumbersOfStudents(){
			return NumberOfStudents;
		}
		//public static int getGPA(){
		//	return gpa;
	//	}
		
		public Student(String newFirstName, String newLastName, String newCUNYID, String newGPA)
		{
			firstName= newFirstName;
			lastName = newLastName;
			cunyID= newCUNYID;
			gpa  = newGPA;
			NumberOfStudents++;
		}
		public void displayAttributes()
		{
			System.out.println("First Name:" + firstName);
			System.out.println("Last Name:" + lastName);
			System.out.println("CunyID:" + cunyID);
			System.out.println("GPA:" + gpa);
		
		}
	public boolean  isValidVenusLogin(){
		int newcunyID =Integer.parseInt(cunyID);
	if (newcunyID<=0 || newcunyID>=99999999);{
		System.out.println("A valid venus login.");
		return true;
		} 
	} 
}
	
			// TODO Auto-generated method stub
			
		
