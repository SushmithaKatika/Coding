import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of employees");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<count; i++){
            System.out.println("enter name");
            String name = sc.nextLine();
            System.out.println("enter designation");
            String role = sc.nextLine().trim().toLowerCase();
            if(role.equals("manager")){
                emp.add(new Manager("name"));
            }else if(role.equals("developer")){
                emp.add(new Developer("name"));
            }else{
                System.out.println("invalid input");
            }

        }

       for (Employee employee : emp) {
         System.out.println(emp);
       }
       sc.close();
    }
}