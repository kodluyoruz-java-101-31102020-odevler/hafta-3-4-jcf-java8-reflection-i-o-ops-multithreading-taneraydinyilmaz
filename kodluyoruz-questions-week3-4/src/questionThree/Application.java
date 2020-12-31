package questionThree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Öðrencinin numarasýný girin: ");
		int studentID=scanner.nextInt();
		scanner.nextLine();
		
		System.err.println("---------------------------------");
		
		System.out.println("Öðrencinin Bölümü: ");
		String studentDepartment=scanner.nextLine();
		
		System.err.println("---------------------------------");
		
		System.out.println("Öðrencinin Adý: ");
		String studentName= scanner.nextLine();
		
		System.err.println("---------------------------------");
		
		System.out.println("Öðrencinin Soyadý: ");
		String studentSurname=scanner.nextLine();
		
		Map<Integer, List<Student>> student=new HashMap<Integer, List<Student>>();
		student.put(studentID, Arrays.asList(new Student(studentID, studentDepartment, studentName, studentSurname)));
		System.out.println(student);
		}
}
