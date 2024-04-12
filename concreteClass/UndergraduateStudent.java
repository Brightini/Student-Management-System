package concreteClass;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;

import Interfaces.Enrollment;
import abstractClasses.AcademicMember;

public class UndergraduateStudent extends AcademicMember implements Enrollment {
	private String studentID;
	private YearMonth enrollmentDate;
	private String program, studentName;
	ArrayList<String> selectedCourses = new ArrayList<>();
	UndergraduateCourse programCourses = new UndergraduateCourse();

	Scanner scanner = new Scanner(System.in);

	public void setProgram(String major) {
		this.program = major;
	}
	public String getProgram() {
		return this.program;
	}

	@Override
	public void setStudentName(String name) {
		this.studentName = name;
	}
	@Override
	public String getStudentName() {
		return this.studentName;
	}

	@Override
	public void setStudentID(String id) {
		this.studentID = id;
	}
	@Override
	public String getStudentID() {
		return this.studentID;
	}

	@Override
	public void setEnrollmentDate(YearMonth date) {
		this.enrollmentDate = date;
	}
	@Override
	public YearMonth getEnrollmentDate() {
		return this.enrollmentDate;
	}

	@Override
	public void enrollCourse() {
		selectCourse();
	}
	public void selectCourse() {
		String choice;
		String[] courses = programCourses.getCourses(this.program);

		String instruction = "Select course to enroll in or enter 'x' to cancel: ";
		while (true) {
			int count = 1;
			System.out.println(instruction);
			for (String course : courses) {
				System.out.println("[" + count + "] " + course);
				count++;
			}
			System.out.print("> ");
			choice = scanner.nextLine();
			if (choice.equals("1")) {
				selectedCourses.add(courses[0]);
			} else if (choice.equals("2")) {
				selectedCourses.add(courses[1]);
			} else if (choice.equals("3")) {
				selectedCourses.add(courses[2]);
			} else if (choice.equals("4")) {
				selectedCourses.add(courses[3]);
			} else if (choice.equals("5")) {
				selectedCourses.add(courses[4]);
			} else if (choice.equals("x")) {
				break;
			} else {
				System.out.println("Course not found");
			}
		}
	}
	@Override
	public void getEnrolledCourses() {
		System.out.println("ENROLLED COURSES: ");
		for (String course : selectedCourses) {
			System.out.println(" -" + course);
		}
	}
	
}
