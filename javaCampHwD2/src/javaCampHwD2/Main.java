package javaCampHwD2;

public class Main {

	public static void main(String[] args) {
		
		Author author = new Author(1, "Engin", "Demiro�");
		
		Category category = new Category(1, "Programlama");
		
		Course courseDotNetAngular = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", category, author);
		Course courseJavaReact = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", category, author);
		Course[] courses = {courseDotNetAngular, courseJavaReact};
		
		// Main Classta Kurs Listeleme
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		// �� S�n�f� ile E�itmen Ekleme
		AuthorManager authorManager = new AuthorManager();
		authorManager.addAuthor(author);
		
		
		// �� S�n�f� ile Kategori Ekleme
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category);
		
		
		// �� S�n�f� ile Kurs Ekleme
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(courseDotNetAngular);
		courseManager.addCourse(courseJavaReact);
		
		// �� S�n�f� ile Kurs Listeleme
		courseManager.getAllCourses(courses);
		
	}
}
