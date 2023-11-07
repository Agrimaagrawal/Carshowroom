import java.util.Scanner;
public class Showroom implements utility{
     String showroom_name;
     String showroom_address;
     int total_cars=0;
     int total_employees;
     
    public void get_details(){
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("total_cars"+total_cars);
        
        



    }
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Showroom name : ");
        showroom_name=sc.nextLine();
        System.out.print("Enter Showroom address : ");
        showroom_address=sc.nextLine();
        System.out.print("Enter total_employee : ");
        total_employees=sc.nextInt();

    }

    
}
