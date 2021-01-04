import java.util.Scanner;  // Scanner class for taking input from user

public class MainApplication
{
    // function for creating MENU
    static int Menu()
    {
        int choice;

        // this print statements will display on console and user will choose one choice
        System.out.println("\n------- BUDGETPRO VER 1.0 -------");
        System.out.println("Enter 1 to ADD new expense");
        System.out.println("Enter 2 to SHOW TOTAL of expense");
        System.out.println("Enter 3 to  DISPLAY LAST EXPENCE details");
        System.out.println("Enter 0 to EXIT program\n");
        System.out.print("Enter your choice: ");

        Scanner s1 = new Scanner(System.in);
        choice = s1.nextInt();

        return choice;
    }


    public static void main(String[] args)
    {
        String itemName;
        double amount;

        // default constructor executed
        Expense exp = new Expense();

        // arraylist that stores expense name and amount
        ExpenseList myList=new ExpenseList();
        while(true)
        {
            switch(Menu())
            {
                // In case when user wants to exit program
                case 0:
                    System.out.println("Thanks for using this software");
                    System.exit(0);


                 // In case when user wants to ADD new expense
                case 1:
                    System.out.print("Enter Name of item: ");
                    Scanner s2 = new Scanner(System.in);
                    itemName = s2.next();

                    System.out.print("Enter Amount of item: ");
                    Scanner s3 = new Scanner(System.in);
                    amount = s3.nextDouble();

                    // parametrized constructor executed
                    exp = new Expense(itemName,amount);

                    myList.addNewExpense(exp);
                    System.out.println("-----------------------------------");
                    System.out.println("-------> Expense Added Successfully <-------");
                    System.out.println("-----------------------------------");
                    break;

                // In case when user wants to DISPLAY total of expense
                case 2:
                    System.out.println("Total expense is: "+myList.giveTotalExpenses());

                    break;

                case 3:

                    // display the expense details ,amount,date of exp object of Expense
                    System.out.println("Expense: "+exp.toString());
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }
        }

    }
}

