//SBI ATM

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ATM1 {

    public double Balance;

    public ATM1(double Balance) {
        this.Balance = Balance;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("\t" + date + " " + time);

        System.out.println("---------------------------------------------");
        System.out.println("***************| SBI ATM |***************");
        System.out.println("---------------------------------------------");

        System.out.println("Welcome Please insert your card...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Please do not remove your card yet..\t\n");

        int pin = 4628;
        System.out.println("Please Enter your pin : ");
        int EnterPin = sc.nextInt();

        if (EnterPin != pin){
            System.out.println("Incorrect pin Please try again....");
            System.exit(0);
        }else {
            System.out.println("Welcome to SBI Bank..!");
        }


    }
}