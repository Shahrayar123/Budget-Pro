import java.util.ArrayList;   // import the ArrayList class

public class ExpenseList
{
    // array list for expenses
    private ArrayList<Expense> explist = new ArrayList<Expense>();

    // this method will add new expense in existing list
    public void addNewExpense(Expense exp)
    {
        explist.add(exp);
    }

    public double giveTotalExpenses()
    {
        // local variable that will stores total expense
        double temp = 0;


        // this loop iterates over the each expense object and getAmount() form Expense class...
          // ...return amount of each object and add in existing temp
        for (Expense i:explist)
        {
            temp = temp + i.getAmount();
        }

        return temp;    // returning total amount
    }

}
