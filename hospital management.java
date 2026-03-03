import java.util.;
class Person {
 String name;
 int age;
 String gender;
 Person(String a, int b, String c) {
 this.name = a;
 this.age = b;
 this.gender = c;
 }
 void displayPersonInfo() {
 System.out.println("Person Details:");
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Gender: " + gender);
 }
}
class Doctor extends Person {
 String specialization;
 double salary;
 Doctor(String a, int b, String c, String d, double e) {
 super(a, b, c);
 this.specialization = d;
 this.salary = e;
 }
 void displayDoctorInfo() {
 System.out.println("Doctor Details:");
 System.out.println("Specialization: " + specialization);
 System.out.println("Salary: " + salary);
 }
}
public class Main{
 public static void main(String[] args) {
 Scanner S = new Scanner(System.in);
 System.out.println("Enter the doctor's name:");
 String name = S.nextLine();
 System.out.println("Enter the doctor's age:");
 int age = S.nextInt();
 S.nextLine(); 
 System.out.println("Enter the doctor's gender:");
 String gender = S.nextLine();
 System.out.println("Enter the doctor's specialization:");
 String specialization = S.nextLine();
 System.out.println("Enter the doctor's salary:");
 double salary = S.nextDouble();
 Doctor doctor = new Doctor(name, age, gender, specialization, salary);
 doctor.displayPersonInfo();
doctor.displayDoctorInfo();
 }
}