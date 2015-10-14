package TranscriptPackage;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Transcript {

	private ArrayList<CourseEnrollment> transcript = new ArrayList<CourseEnrollment>();
	private int arrayCounter;
	
	public Transcript(){
		this.arrayCounter = 0;
		
		
	}
	
	public void addCourse(CourseEnrollment CE){
		this.transcript.add(arrayCounter, CE);
		this.arrayCounter++;
	}
	
	public ArrayList<CourseEnrollment> getCourse(){
		return transcript;
		
	}
	
	public double getOverallGPA(){
		double gpa = 0.0;
		int totalCredits = 0; 
		for (int i = 0; i < transcript.size(); i++){
			totalCredits += transcript.get(i).getCredits();
			gpa += transcript.get(i).getCredits() * transcript.get(i).getQualityPoints(transcript.get(i).getGrade());
		}
		gpa = gpa / totalCredits;
		return gpa;
	}
	
	public String getFormattedGPA(double gpa){
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(2);
		return formatter.format(gpa);
		
		
	}
}
