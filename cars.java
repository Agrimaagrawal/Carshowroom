import java.util.Scanner;
public class cars extends Showroom implements utility{
       String car_name;
       String car_color;
       int car_price;

       public void get_details(){
        System.out.println("carname="+car_name);
        System.out.print("carcolor="+car_color);
        System.out.println("car price="+car_price);
       }
       public void set_details()
         {     Scanner sc=new Scanner(System.in);
            System.out.println("enter car name");
                car_name=sc.nextLine();
                System.out.println("enter car color");
                car_color=sc.nextLine();
                System.out.println("enter car price");
                car_price=sc.nextInt();

                total_cars++;
                 }    
}
