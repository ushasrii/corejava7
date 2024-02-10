package ai.dv.ui;

import ai.dv.model.Student;

public class Program28StudentApp {
	public static void main(String[] args) {
		Student.setCollegeName("BVCITS");
		Student.setStudentId(101);
		Student usha = new Student("Usha", 80, 75, 90);
		Student syamala = new Student("Syamala", 87, 78, 89);
		Student durga = new Student("Durga", 75, 30, 85);
		Student kamala = new Student("Kamala", 80, 70, 72);
		System.out.println(Student.getStudentId() + "\t" + usha.getStudentName() + "\t" + usha.getEnglishMarks() + "\t"
				+ usha.getTeluguMarks() + "\t" + usha.getHindiMarks() + "\t" + Student.getCollegeName() + "\t"
				+ usha.getResult());
		System.out.println(Student.getStudentId() + "\t" + syamala.getStudentName() + "\t" + syamala.getEnglishMarks()
				+ "\t" + syamala.getTeluguMarks() + "\t" + syamala.getHindiMarks() + "\t" + Student.getCollegeName()
				+ "\t" + syamala.getResult());
		System.out.println(Student.getStudentId() + "\t" + durga.getStudentName() + "\t" + durga.getEnglishMarks()
				+ "\t" + durga.getTeluguMarks() + "\t" + durga.getHindiMarks() + "\t" + Student.getCollegeName() + "\t"
				+ durga.getResult());
		System.out.println(Student.getStudentId() + "\t" + kamala.getStudentName() + "\t" + kamala.getEnglishMarks()
				+ "\t" + kamala.getTeluguMarks() + "\t" + kamala.getHindiMarks() + "\t" + Student.getCollegeName()
				+ "\t" + kamala.getResult());
	}

}
