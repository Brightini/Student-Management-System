package abstractClasses;

import java.time.YearMonth;

public abstract class Faculty {
	public abstract void setName(String name);
	public abstract String getName();
	
	public abstract void setFaculty(String faculty);
	public abstract String getFaculty();
	
	public abstract void setFacultyID(String id);
	public abstract String getFacultyID();
	
	public abstract void setEnrollmentDate(YearMonth date);
	public abstract YearMonth getEnrollmentDate();
}
