package javaCampHwD3;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor(1, "Engin", "Demiro�", "EnginD", "engin.demirog");
		
		Student ayse = new Student(1, "Ay�e", "Kara", "AyseK", "ayse.kaya");
		Student fatma = new Student(2, "Fatma", "T�ten", "FatmaT", "fatma.tuten");
		Student veli = new Student(3, "Veli", "Demir", "VeliD", "veli.demir");
		
		Student[] students = {ayse, fatma, veli};
		User[] users = {engin, ayse, fatma, veli};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);
		instructorManager.login(engin);
		
		System.out.println("--------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addMultiple(students);
		studentManager.login(ayse);
		studentManager.login(fatma);
		studentManager.login(veli);
		
		System.out.println("--------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.getAllUsers(users);
		
	}
}
