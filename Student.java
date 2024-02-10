package ai.dv.model;

public class Student {
	private static int studentId;
	private String studentName;
	private int englishMarks;
	private int teluguMarks;
	private int hindiMarks;
	private static String clgName;

	public Student() {
		/* Default constructor */
	}

	public Student(String studentName, int englishMarks, int teluguMarks, int hindiMarks) {
		this.studentName = studentName;
		this.englishMarks = englishMarks;
		this.teluguMarks = teluguMarks;
		this.hindiMarks = hindiMarks;
	}

	public static void setCollegeName(String collegeName) {
		clgName = collegeName;
	}

	public static String getCollegeName() {
		return clgName;
	}

	public static void setStudentId(int sid) {
		studentId = sid;
	}

	public static int getStudentId() {
		return studentId++;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public int getEnglishMarks() {
		return this.englishMarks;
	}

	public int getTeluguMarks() {
		return this.teluguMarks;
	}

	public int getHindiMarks() {
		return this.hindiMarks;
	}
	public String getResult() {
		if (englishMarks >= 35 && teluguMarks >= 35 && hindiMarks >= 35) {
			int marks = englishMarks + teluguMarks + hindiMarks;
			double average = marks / 3.0;
			return average >= 35 ? "Pass" : "Fail";
		} else {
			return "Fail";
		}
	}
}
