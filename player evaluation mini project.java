import java.io.*;
import java.util.*;
interface Exam {
 int getExamMarks();
}
interface Assignment {
 int getAssignmentMarks();
}
interface Project {
 int getProjectMarks();
}
interface Attendance {
 int getAttendanceMarks();
}
class StudentEvaluation implements Exam, Assignment, Project, Attendance {
 int exam, assignment, project, attendance;
 StudentEvaluation(int exam, int assignment, int project, int attendance) {
 this.exam = exam;
 this.assignment = assignment;
 this.project = project;
 this.attendance = attendance;
 }
 public int getExamMarks() {
 return exam;
 }
 public int getAssignmentMarks() {
 return assignment;
 }
 public int getProjectMarks() {
 return project;
 }
 public int getAttendanceMarks() {
 return attendance;
 }
 public void calculateResult() {
 int total = exam + assignment + project + attendance;
 double average = total / 4.0;
 System.out.println("Total Marks: " + total);
 System.out.println("Average Marks: " + average);
 if (average >= 75)
 System.out.println("Grade: A");
 else if (average >= 60)
 System.out.println("Grade: B");
 else
 System.out.println("Grade: C");
 }
}
public class Main{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Exam Marks: ");
 int exam = sc.nextInt();
 System.out.print("Enter Assignment Marks: ");
 int assignment = sc.nextInt();
 System.out.print("Enter project Marks: ");
 int project = sc.nextInt();
 System.out.print("Enter Attendance Marks: ");
 int attendance = sc.nextInt();
 StudentEvaluation s = new StudentEvaluation(exam, assignment, project, attendance);
 s.calculateResult();
 }
}