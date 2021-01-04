import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Expense
{
    private String details;
    private double amount;
    private LocalDate expensedate;

    // default constructor
    public Expense(){}

    // parametrized constructor to take values at time of creating object
    public Expense(String details, double amount)
    {

        // setting item
        this.details = details;

        // setting price
        this.amount = amount;
    }

    // getter for amount
    public double getAmount() {
        return this.amount;
    }

    // getter for details
    public String getDetails() {
        return this.details;
    }

    @Override
    public String toString()
    {
        // format date, details and amount as required
        return expensedate.now() +","+ details +","+ amount;
    }


}