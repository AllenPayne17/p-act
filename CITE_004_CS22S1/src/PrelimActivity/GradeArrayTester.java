package PrelimActivity;

public class GradeArrayTester {
	
	public static void main(String[] args) {
		Grade [] prelim = new Grade[3];
		
		prelim[0] = new Grade(88,89,79,100);
		prelim[1] = new Grade(88,89,79,100);
		prelim[2] = new Grade(88,89,79,100);
		
		
		for( int i = 0; i < prelim.length; i++) {
			System.out.println("Assignment" + prelim[i].getAssignment());
			System.out.println("Assignment" + prelim[i].getAttendance());
			System.out.println("Assignment" + prelim[i].getMachineproblem());
			System.out.println("Assignment" + prelim[i].getProject());
			
			System.out.println(prelim[i].computeGrade(prelim[i].getAssignment(), prelim[i].getAttendance(), prelim[i].getMachineproblem(), prelim[i].getProject()));
		}
	}
	
}
