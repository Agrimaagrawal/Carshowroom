import java.util.Scanner;
public class Employee extends Showroom implements utility {
    String Employee_name;
    String Employee_department;
    int Employee_salary;
    public void get_details(){
        System.out.println("Employee_name"+Employee_name);
        System.out.println("Employee_department"+ Employee_department);
        System.out.println("Employee_salary"+Employee_salary);

    }
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        Employee_name=sc.nextLine();
        Employee_department=sc.nextLine();
        Employee_salary=sc.nextInt();
    }

    
}
