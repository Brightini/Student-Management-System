
import concreteClass.UndergraduateStudent;
import concreteClass.FacultyMember;
import concreteClass.GraduateStudent;
import java.time.YearMonth;
import java.util.Scanner;

public class Main {
	static final String CSC = "Computer Science";
	static final String DAT = "Data Engineering";
	static final String MED = "Medicine and Surgery";
	static final String PHM = "Pharmacy";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String...args) {
		while (true) {
			System.out.println("Choose an action:");
			System.out.println("[1] Register as an undergraduate student");
			System.out.println("[2] Register as a graduate student");
			System.out.println("[3] Register as a faculty member");
			System.out.println("[4] Exit");
			System.out.print("> ");
			
			String userInput = scanner.nextLine();
			switch (userInput) {
				case "1":
					addUndergraduateStudent();
					break;
				case "2":
					addGraduateStudent();
					break;
				case "3":
					addFacultyMember();
				case "4":
					System.exit(0);
			}
		}
	}

	private static void addUndergraduateStudent() {
		UndergraduateStudent student = new UndergraduateStudent();

        String name = askName();
        String program = selectProgram();
        String studentID = generateID(program);
        YearMonth enrollmentDate = YearMonth.now();

        student.setStudentName(name);
        student.setProgram(program);
        student.setStudentID(studentID);
        student.setEnrollmentDate(enrollmentDate);
        student.enrollCourse();

        System.out.println("");
        System.out.println("Registration successful. Find your details below:");
		System.out.println("STUDENT NAME: " + student.getStudentName());
		System.out.println("UNDERGRADUATE PROGRAM: " + student.getProgram());
		System.out.println("STUDENT ID: " + student.getStudentID());
		System.out.println("ENROLLMENT DATE: " + student.getEnrollmentDate());
		student.getEnrolledCourses();
		System.out.println();
    }

    private static void addGraduateStudent() {
    	GraduateStudent student = new GraduateStudent();

        String name = askName();
        String program = selectProgram();
        String studentID = generateID(program);
        YearMonth enrollmentDate = YearMonth.now();
         String thesisTitle = askThesisTitle();

        student.setStudentName(name);
        student.setProgram(program);
        student.setThesisTitle(thesisTitle);
        student.setStudentID(studentID);
        student.setEnrollmentDate(enrollmentDate);
        student.enrollCourse();

        System.out.println("");
		System.out.println("Registration successful. Find your details below:");
		System.out.println("STUDENT NAME: " + student.getStudentName());
		System.out.println("GRADUATE PROGRAM: " + student.getProgram());
		System.out.println("THESIS TITLE: " + student.getThesisTitle());
		System.out.println("STUDENT ID: " + student.getStudentID());
		System.out.println("ENROLLMENT DATE: " + student.getEnrollmentDate());
		System.out.println("Your courses: ");
		student.getEnrolledCourses();
		System.out.println();
    }
    
    public static void addFacultyMember() {
    	FacultyMember facultyMember = new FacultyMember();

        String name = askName();
        String program = selectFaculty();
        YearMonth enrollmentDate = YearMonth.now();
        String facultyID = generateID(program);
        
        facultyMember.setName(name);
        facultyMember.setFaculty(program);
        facultyMember.setEnrollmentDate(enrollmentDate);
        facultyMember.setFacultyID(facultyID);
        facultyMember.getFacultyID();

        System.out.println("");
		System.out.println("Registration successful. Find your details below:");
		System.out.println("FACULTY NAME: " + facultyMember.getName());
		System.out.println("FACULTY: " + facultyMember.getFaculty());
		System.out.println("FACULTY ID: " + facultyMember.getFacultyID());
		System.out.println("ENROLLMENT DATE: " + facultyMember.getEnrollmentDate());
		System.out.println();
    }

    private static String askName() {
    	System.out.print("Enter your name: ");
    	String name = scanner.nextLine();
    	return name;
    }
    
    private static String askThesisTitle() {
    	String thesisTitle;
 
    	System.out.println("Enter your thesis title: ");
		System.out.print("> ");
		thesisTitle = scanner.nextLine();
		
		return thesisTitle;
    }

    private static String selectProgram() {    	
    	System.out.println("Select your program:");
		System.out.println("[1] " + CSC + " (CSC)");
		System.out.println("[2] " + DAT + " (DAT)");
		System.out.println("[3] " + MED + " (MED)");
		System.out.println("[4] " + PHM + " (PHM)");
		System.out.print("> ");
		String program = scanner.nextLine();

		switch(program) {
			case "1":
				return CSC;
			case "2":
				return DAT;
			case "3":
				return MED;
			case "4":
				return PHM;
			default:
				return null;
		}
    }

    private static String selectFaculty() {    	
    	System.out.println("Select your faculty:");
		System.out.println("[1] " + CSC + " (CSC)");
		System.out.println("[2] " + DAT + " (DAT)");
		System.out.println("[3] " + MED + " (MED)");
		System.out.println("[4] " + PHM + " (PHM)");
		System.out.print("> ");
		String program = scanner.nextLine();

		switch(program) {
			case "1":
				return CSC;
			case "2":
				return DAT;
			case "3":
				return MED;
			case "4":
				return PHM;
			default:
				return null;
		}
    }

    public static String generateID(String code) {
    	String programCode = null;
    	String studentID = null;

    	if (code.equals(CSC)) {
    		programCode = "CSC";
			studentID = programCode + String.format("%04d", 1);
			return studentID;
		} else if (code.equals(DAT)) {
			programCode = "DAT";
			studentID = programCode + String.format("%04d", 1);
			return studentID;
		} else if (code.equals(MED)) {
			programCode = "MED";
			studentID = programCode + String.format("%04d", 1);
			return studentID;
		} else if (code.equals(PHM)) {
			programCode = "PHM";
			studentID = programCode + String.format("%04d", 1);
			return studentID;
		}
    	return null;
    }
}
