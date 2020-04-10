import java.util.*;

class Student {
	String index;
	String firstName;
	String lastName;
	
	List<Integer> labPoints = new ArrayList<Integer>();

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		super();
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		int total = 0;
		double avg = 0;
		
		for( int i = 0; i < getLabPoints().length; i++ ) {
			total += getLabPoints()[i];
		}
		
		avg = total/getLabPoints().length;
		return avg;
	}

	public boolean hasSignature() {
		if( getLabPoints().length > 8 ) {
			return true;
		}

		return false;
	}
	
}