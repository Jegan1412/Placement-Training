import java.util.*;

abstract class BankAccount{
    private int accountNumber;
    private double balance;
    static double intrestRate, intrest=0;
    
    public BankAccount(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account No: ");
        this.accountNumber = input.nextInt();
        System.out.println("Enter Balance: ");
        this.balance = input.nextDouble();
        System.out.println("Enter Intrest Rate: ");
        this.intrestRate = input.nextDouble();
    }
    
    public double get_balance(){
        return balance;
    }
    
    public double get_intrestRate(){
        return intrestRate;
    }
    
    abstract double calculateInterest();
    
    void display(){
        System.out.println("\nAccount No: "+accountNumber+"\nBalance: "+balance+
        "\nIntrest: "+intrest+"\nTotal Balance: "+(balance+intrest)+"\n");
    }
}

class SavingsAccount extends BankAccount{
    private int duration;
    SavingsAccount(){
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Duration(Months): ");
        this.duration = input.nextInt();
    }
    
    double calculateInterest(){
        intrest = (double)((super.get_balance()*super.get_intrestRate()*duration)/100);
        return intrest;
    }
}

class CurrentAccount extends BankAccount{
    private int duration;
    CurrentAccount(){
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Duration(Years): ");
        this.duration = input.nextInt();
    }
    
    double calculateInterest(){
        intrest = (double)((super.get_balance()*super.get_intrestRate()*duration)/100);
        return intrest;
    }
}

public class Abstraction_BankAccount
{
	public static void main(String[] args) {
	    
	    SavingsAccount s = new SavingsAccount();
	    s.calculateInterest();
	    s.display();
	    CurrentAccount c = new CurrentAccount();
	    c.calculateInterest();
	    c.display();
	}
}
