package Shalgalt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course crse = new Course("Software Construction");
		crse.setCourseName("Software Construction");
		
		System.out.println(crse.courseName);
		System.out.println(crse.getCourseName());
		
		crse.setCourseName("Программ хангамжийн бүтээлт");
		System.out.println(crse.getCourseName());
	}

}
