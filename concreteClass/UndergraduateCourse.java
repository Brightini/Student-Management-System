package concreteClass;

public class UndergraduateCourse {
	static final String CSC = "Computer Science";
	static final String DAT = "Data Engineering";
	static final String MED = "Medicine and Surgery";
	static final String PHM = "Pharmacy";

	private String[] computerScienceCourse = {
		"Introduction to Computer Science (CSC 101)",
		"Data Structures and Algorithm (CSC 103)",
		"Software Engineering (CSC 105)",
		"Database Systems (CSC 107)",
		"Operating Systems (CSC 109)",
	};
	
	private String[] dataEngineeringCourses = {
		"Introduction to Data Engineering (DAT 101)",
		"Big Data Technologies (DAT 103)",
		"Machine Learning (DAT 105)",
		"Data Minining (DAT 107)",
		"Data Warehousing (DAT 109)",
	};
	
	private String[] medicineCourses = {
		"Anatomy (ANT 101)",
	    "Physiology (PHY 103)",
	    "Biochemistry (BIO 105)",
	    "Pathology (PTH 107)",
	    "Pharmacology (PHM 109)",
	};
	
	private String[] pharmacyCourses = {
	    "Pharmaceutics (PHM 101)",
	    "Pharmacognosy (PHM 103)",
	    "Pharmaceutical Chemistry (PHM 105)",
	    "Pharmacy Practice (PHM 107)",
	    "Pharmacology (PHM 109)",
	};

	public String[] getCourses(String major) {
		switch(major) {
			case CSC:
				return computerScienceCourse;
			case DAT:
				return dataEngineeringCourses;
			case MED:
				return medicineCourses;
			case PHM:
				return pharmacyCourses;
			default:
				return new String[0];
		}
				
	}
}
