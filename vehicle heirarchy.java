import java.util.*;
class Vehicle {
 public void displayDetails(String brand, String model) {
 System.out.println("Vehicle Details:");
 System.out.println("Brand: " + brand);
 System.out.println("Model: " + model);
 }
 public void displayDetails(int speed) {
 System.out.println("Vehicle Speed: " + speed + " km/h");
 if (speed > 120) {
 System.out.println("High Speed");
 } 
else {
 System.out.println("Normal Speed");
 }
 }
}
public class Solution {
 public static void main(String[] args) {
 Scanner S = new Scanner(System.in);
 Vehicle vehicle = new Vehicle();
 System.out.println("Menu");
 System.out.println("1. Vehicle Details");
 System.out.println("2. Speed Details");
 int choice = S.nextInt();
 S.nextLine();
 if (choice == 1) {
 System.out.println("Enter the brand name:");
 String brand = S.nextLine();
 System.out.println("Enter the model name:");
 String model = S.nextLine();
 vehicle.displayDetails(brand, model);
 }
 else if (choice == 2) {
 System.out.println("Enter the speed:");
 int speed = S.nextInt();
 vehicle.displayDetails(speed);
 }
 else {
 System.out.println("Invalid Choice");
 }
 }
}