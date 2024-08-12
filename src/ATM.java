import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ATM {

    public double Balance;

    public ATM(double Balance){
        this.Balance = Balance;
    }

//    CheckBalance
    public void CheckBalance(){
        System.out.println("Your Current Balance : "+Balance);
    }

//    Deposit
    public void Deposit(double amount){
       if(amount > 0){
           Balance += amount;
           System.out.println("You have Deposit : "+amount);
           CheckBalance();
       }else {
           System.out.println("Deposit Not Receive.....!");
       }
    }
//       Withdraw
    public void Withdraw(double amount){
        if (amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println("Successfully Withdraw : "+amount+" Rs");
            CheckBalance();
        }else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public static void main(String[] args) {


        LocalDate Date = LocalDate.now();
        LocalTime Time = LocalTime.now();

        System.out.println("\t\t" + Date + "  " + Time);

        System.out.println("\n----------------------------------------------------");
        System.out.println("***************  Welcome To SBI Bank  **************");
        System.out.println("----------------------------------------------------");
        System.out.println("\nWelcome! Please insert your card do not remove your card yet.....!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Toolkit.getDefaultToolkit().beep();

        //Atm Information.
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000);

        while (true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("\nPlease Select an Option : ");
            int option = sc.nextInt();

            switch (option){

                case 1:
                    atm.CheckBalance();
                    break;

                case 2:
                    System.out.println("Enter Deposit amount : ");
                    double depositAmount = sc.nextDouble();
                    atm.Deposit(depositAmount);
                    break;


                case 3:
                    System.out.println("Enter withdraw balance : ");
                    double withdrawBalance = sc.nextDouble();
                    atm.Withdraw(withdrawBalance);
                    break;

                case 4:
                    System.out.println("Thank you for using SBI ATM \nHave a good day....!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Option Please Try Again.....!");
            }
            System.out.println();
        }

    }
}
