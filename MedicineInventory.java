import java.util.Scanner;

public class MedicineInventory {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("      MEDICINE INVENTORY SYSTEM      ");
        
        System.out.print("Enter medicine name: ");
        String medicineName1 = sc.nextLine();
        System.out.print("Enter price per tablet (in NPR): ");
        double price1 = sc.nextDouble();
        System.out.print("Enter quantity in stock: ");
        int quantity1 = sc.nextInt();
        
        System.out.print("Does it require a prescription? (yes/no): ");
        String prescription1 = sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("Enter medicine name: ");
        String medicineName2 = sc.nextLine();
        System.out.print("Enter price per tablet (in NPR): ");
        double price2 = sc.nextDouble();
        System.out.print("Enter quantity in stock: ");
        int quantity2 = sc.nextInt();
        
        System.out.print("Does it require a prescription? (yes/no): ");
        String prescription2 = sc.nextLine();

        System.out.println("        MEDICINE INVENTORY REPORT     ");

        System.out.println("Medicine Name: " + medicineName1);
        System.out.println("Price (NPR): " + price1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Prescription Required: " + prescription1);
        System.out.println("-------------------------------------");
        System.out.println("Medicine Name: " + medicineName2);
        System.out.println("Price (NPR): " + price2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Prescription Required: " + prescription2);

        System.out.println("        END OF INVENTORY REPORT       ");
    }
}