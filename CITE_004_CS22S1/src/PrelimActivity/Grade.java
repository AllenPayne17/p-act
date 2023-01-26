package PrelimActivity;

public class Grade {
	private double assignment = 0.0;
	private double attendance = 0.0;
	private double machineproblem = 0.0;

	private double project = 0.0;

	public Grade(double assignment, double attendance, double machineproblem, double project) {
//		super();
		this.assignment = assignment;
		this.attendance = attendance;
		this.machineproblem = machineproblem;
		this.project = project;
	}

	public double getAssignment() {
		return assignment;
	}

	public void setAssignment(double assignment) {
		this.assignment = assignment;
	}

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}

	public double getMachineproblem() {
		return machineproblem;
	}

	public void setMachineproblem(double machineproblem) {
		this.machineproblem = machineproblem;
	}

	public double getProject() {
		return project;
	}

	public void setProject(double project) {
		this.project = project;
	}
	//customized method
	public double computeGrade(double assignment, double attendance, double project, double machineProblem) {
		double grade = 0.0;
		grade = (assignment + attendance + project + machineProblem) / 4;
		return grade;
	}
}
