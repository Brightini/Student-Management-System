package concreteClass;

public class GraduateCourse {
	static final String CSC = "Computer Science";
	static final String DAT = "Data Engineering";
	static final String MED = "Medicine and Surgery";
	static final String PHM = "Pharmacy";

	private String[] computerScienceCourse = {
			"Advanced Algorithms",
			"Machine Learning",
			"Distributed Systems",
			"Artificial Intelligence",
	};
	
	private String[] dataEngineeringCourses = {
		"Big Data Analytics",
		"Stream Processing Systems",
		"Data Mining Techniques",
		"Data Warehousing",
	};
	
	private String[] medicineCourses = {
		"Anatomy and Physiology",
	    "Surgical Techniques",
	    "Medical Ethics and Professionalism",
	    "Pharmacology",
	};
	
	private String[] pharmacyCourses = {
	    "Pharmaceutical Chemistry",
	    "Pharmacotherapy",
	    "Clinical Pharmacy Practice",
	    "Pharmaceutical Biotechnology",
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
