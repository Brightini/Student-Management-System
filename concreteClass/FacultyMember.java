package concreteClass;

import java.time.YearMonth;

import abstractClasses.Faculty;

public class FacultyMember extends Faculty {
	private String name, faculty, facultyID;
	YearMonth enrollmentDate;

	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String getFaculty() {
		return this.faculty;
	}
	
	@Override
	public void setFacultyID(String id) {
		this.facultyID = id;
	}
	@Override
	public String getFacultyID() {
		return this.facultyID;
	}

	@Override
	public void setEnrollmentDate(YearMonth date) {
		this.enrollmentDate = date;
	}
	@Override
	public YearMonth getEnrollmentDate() {
		return this.enrollmentDate;
	}
}
