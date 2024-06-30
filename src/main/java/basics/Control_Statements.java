package basics;
import java.util.Scanner;
public class Control_Statements {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        if((age<=60)&&(age>=18))
        {
            System.out.println("you are eligible to open a major account in our bank");
            System.out.println("Would you like to open a Current Account or a Saving Account?(Enter 'Current' or 'Savings')");
            scan.nextLine();
            String accountType = scan.nextLine();
            if(accountType.equalsIgnoreCase("current"))
            {
                System.out.println("Thank you, You have chosen to open a Current Account");
            }
            else if (accountType.equals("savings"))
            {
                System.out.println("Thank you, You have chosen to open a Saving Account");
            }
            else
            {
                System.out.println("Invalid Account Type Entered");
            }
        } else if ((age<=18)&&(age>=0)) {
            System.out.println("You are eligible to open a Minor Account");
            System.out.println("Do you have a parent or guardian's consent?(yes/no)");
            String app = scan.next();
            if (app.equalsIgnoreCase("yes"))
            {
                System.out.println("You can open a Minor Account");
            }
            else {
                System.out.println("parent or guardian is required for opening a Minor Account");
            }
        }
        else{
            System.out.println("Invalid age entered");
        }
    }
}
