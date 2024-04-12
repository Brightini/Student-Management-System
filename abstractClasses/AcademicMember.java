package abstractClasses;

import java.time.YearMonth;

public abstract class AcademicMember {
	public abstract void setStudentName(String name);
	public abstract String getStudentName();
	
	public abstract void setStudentID(String id);
	public abstract String getStudentID();
	
	public abstract void setEnrollmentDate(YearMonth date);
	public abstract YearMonth getEnrollmentDate();
}
