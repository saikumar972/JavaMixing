package eclipse2.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentList {
	public static List<Student> studentslist(){
		return Stream.of(
                new Student(1, "Rajveer", "rajveer@gmail.com", Arrays.asList("12133", "2241")),
                new Student(2, "Sai", "sai@gmail.com", Arrays.asList("23525", "22425251")),
                new Student(3, "Kumar", "kumar@gmail.com", Arrays.asList("2523434", "2276567941"))
        ).collect(Collectors.toList());		
	}
}
