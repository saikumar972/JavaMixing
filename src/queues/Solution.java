package queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> studentQueue = new PriorityQueue<>((s1, s2) -> {
            if (s1.getCgpa() > s2.getCgpa()) {
                return -1; // Higher CGPA comes first
            } else if (s1.getCgpa() < s2.getCgpa()) {
                return 1; // Lower CGPA comes later
            } else { // CGPA is equal
                int nameComparison = s1.getName().compareTo(s2.getName());
                if (nameComparison == 0) { // Names are equal, compare by ID
                    return Integer.compare(s1.getId(), s2.getId());
                }
                return nameComparison; // Alphabetical order for names
            }
        });

        for(String event:events){
            String[] StringArray=event.split(" ");
            if(StringArray[0].equals("ENTER")){
                String name=StringArray[1];
                double cgpa=Double.parseDouble(StringArray[2]);
                int id=Integer.parseInt(StringArray[3]);
                studentQueue.add(new Student(id,name,cgpa));
            }else if (StringArray[0].equals("SERVED")) {
                studentQueue.poll();
            }
        }
        List<Student> list=new ArrayList<>();
        while(!studentQueue.isEmpty()){
            list.add(studentQueue.poll());
        }
        return list;
    }
}
class Student{
    private String name;
    private double cgpa;
    private int id;
    public Student(int id,String name,double cgpa){
        this.cgpa=cgpa;
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    public int getId(){
        return this.id;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}