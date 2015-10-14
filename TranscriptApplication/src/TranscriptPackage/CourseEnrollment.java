package TranscriptPackage;

public class CourseEnrollment {

	private String course;
	private int credits;
	private String grade;

	public CourseEnrollment(String course, int credits, String grade) {
		this.course = course;
		this.credits = credits;
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getQualityPoints(String grade) {
		double qltyPnt = 0.0;

		switch (grade) {
		case "A":
			qltyPnt = 4.0;
			break;
		case "B":
			qltyPnt = 3.0;
			break;
		case "C":
			qltyPnt = 2.0;
			break;
		case "D":
			qltyPnt = 1.0;
			break;
		case "F":
			qltyPnt = 0.0;
			break;
		}

		return qltyPnt;
	}
}
