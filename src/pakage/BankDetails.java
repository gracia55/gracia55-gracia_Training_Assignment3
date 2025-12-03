package pakage;

// Parent Class
class BankAccount {
    long accountNo;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount Withdrawn: ₹" + amount);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: ₹" + interest);
    }
}


class SalaryAccount extends BankAccount {
    double monthlySalary;

    void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited: ₹" + monthlySalary);
    }
}


public class BankDetails {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.accountNo = 101;
        sa.balance = 5000;
        sa.interestRate = 5;
        sa.addInterest();

        SalaryAccount sla = new SalaryAccount();
        sla.accountNo = 102;
        sla.balance = 8000;
        sla.monthlySalary = 30000;
        sla.creditSalary();
    }
}
