import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The main public class. The file must be named InteractiveRentalSystem.java
public class RentalSystem {

    public static void main(String[] args) {
        // 1. Create our vehicle collections (our "database")
        List<Vehicle> carCollection = new ArrayList<>();
        carCollection.add(new Car("Toyota", "Camry", 2022, 4, "Petrol", 3500));
        carCollection.add(new Car("Honda", "City", 2023, 4, "Petrol", 3200));
        carCollection.add(new Car("Mahindra", "Thar", 2023, 2, "Diesel", 5000));

        List<Vehicle> bikeCollection = new ArrayList<>();
        bikeCollection.add(new Motorcycle("Royal Enfield", "Classic 350", 2022, false, 1500));
        bikeCollection.add(new Motorcycle("TVS", "Apache RTR 160", 2023, false, 1200));

        // 2. Setup scanner to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Vehicle Rental System! ---");
        System.out.print("What would you like to rent? (car/bike): ");
        String choice = scanner.nextLine().toLowerCase();

        List<Vehicle> selectedCollection;

        // 3. Determine which collection to show
        if (choice.equals("car")) {
            selectedCollection = carCollection;
        } else if (choice.equals("bike")) {
            selectedCollection = bikeCollection;
        } else {
            System.out.println("Invalid choice. Please restart the program.");
            scanner.close();
            return; // Exit program
        }

        // 4. Display the selected collection
        System.out.println("\nHere is our collection of " + choice + "s:");
        for (int i = 0; i < selectedCollection.size(); i++) {
            Vehicle v = selectedCollection.get(i);
            System.out.printf("%d. %s %s (%d) - ₹%.2f/day\n", 
                              (i + 1), v.getMake(), v.getModel(), v.getYear(), v.getPricePerDay());
        }

        // 5. Ask user to pick a vehicle
        System.out.print("\nPlease select a vehicle by number: ");
        int vehicleIndex = scanner.nextInt() - 1;

        // 6. Ask for number of days
        System.out.print("For how many days would you like to rent it? ");
        int rentalDays = scanner.nextInt();

        // 7. Calculate and display the final price
        if (vehicleIndex >= 0 && vehicleIndex < selectedCollection.size() && rentalDays > 0) {
            Vehicle chosenVehicle = selectedCollection.get(vehicleIndex);
            double totalPrice = chosenVehicle.getPricePerDay() * rentalDays;

            System.out.println("\n--- Your Booking Details ---");
            System.out.println("Vehicle: " + chosenVehicle.getMake() + " " + chosenVehicle.getModel());
            System.out.println("Rental Duration: " + rentalDays + " days");
            System.out.printf("Total Price: ₹%.2f\n", totalPrice);
            System.out.println("Thank you for your booking!");
        } else {
            System.out.println("Invalid selection or number of days. Please try again.");
        }

        scanner.close();
    }
}

// NOTICE: "public" keyword is removed. This is now a package-private class.
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double pricePerDay;
    private boolean isRented;

    public Vehicle(String make, String model, int year, double pricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isRented = false;
    }

    // --- Public Getters ---
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPricePerDay() { return pricePerDay; }
    public boolean isRented() { return isRented; }
    
    // Abstract method must be implemented by subclasses
    public abstract void displayDetails();
}

// NOTICE: "public" keyword is removed.
class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String make, String model, int year, int numberOfDoors, String fuelType, double pricePerDay) {
        super(make, model, year, pricePerDay);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + getMake() + " " + getModel());
    }
}

// NOTICE: "public" keyword is removed.
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar, double pricePerDay) {
        super(make, model, year, pricePerDay);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle: " + getMake() + " " + getModel());
    }
}