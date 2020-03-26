/*Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
*/

public class Patient {
	String patientName;
	double height, weight;
	
	Patient(String name, double height, double weight){
		this.patientName = name;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI() {
		// BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
		return ( weight / ( height * height ) ) * 703;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient = new Patient("XYZ", 177/2.54, 59*2.2);
		System.out.println("Name: " + patient.patientName + "\nBMI: " + patient.computeBMI());
	}

}
