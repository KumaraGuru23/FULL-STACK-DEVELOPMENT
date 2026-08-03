package MY_PROJECT;

import java.util.Scanner;

class Bike {
 private String model;
 private int cc;
 private double price;

 public Bike(String model, int cc, double price) {
     this.model = model;
     this.cc = cc;
     this.price = price;
 }

 public double getPrice() {
     return price;
 }

 public void displayDetails() {
     System.out.println("Model: " + model + " | CC: " + cc + " | Price: ₹" + price);
 }
}

class StoreRoom {
 private String storeName;

 public StoreRoom(String storeName) {
     this.storeName = storeName;
 }

 public void showStoreName() {
     System.out.println("Welcome to " + storeName);
 }
}

public class KtmStoreRoom {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     StoreRoom store = new StoreRoom("KTM Store Room");
     store.showStoreName();

     Bike duke200 = new Bike("Duke", 200, 170000);
     Bike duke390 = new Bike("Duke", 390, 280000);
     Bike rc200 = new Bike("KTM RC", 200, 170000);
     Bike rc390 = new Bike("KTM RC", 390, 280000);
     Bike adventure = new Bike("KTM Adventure", 390, 300000);

     System.out.println("Available Bikes:");
     duke200.displayDetails();
     duke390.displayDetails();
     rc200.displayDetails();
     rc390.displayDetails();
     adventure.displayDetails();

     System.out.print("Enter your choice (1.Duke200, 2.Duke390, 3.RC200, 4.RC390, 5.Adventure): ");
     int choice = sc.nextInt();

     Bike selectedBike = null;
     switch(choice) {
         case 1: selectedBike = duke200; break;
         case 2: selectedBike = duke390; break;
         case 3: selectedBike = rc200; break;
         case 4: selectedBike = rc390; break;
         case 5: selectedBike = adventure; break;
         default: System.out.println("Invalid choice!"); 
         return;
     }

     System.out.print("Do you want extra attachment? (yes/no): ");
     String attach = sc.next();

     double finalPrice = selectedBike.getPrice();
     if(attach.equalsIgnoreCase("yes")) {
         finalPrice += 5000;
     }

     System.out.println("Final Bill:");
     selectedBike.displayDetails();
     System.out.println("****thankyou****");
     sc.close();
    
 }
}

