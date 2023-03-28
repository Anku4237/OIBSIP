/*
 * This program allows the user to perform three actions:
 * check their transaction history, withdraw money, and deposit money, transfer money.
 * The program also includes error checking to ensure that the user enters valid input.
 * The program runs until the user chooses to exit.
 * */


package ATM;

import java.util.Scanner;

public class ATMMachine {
    int Balance = 5000;

    int transaction = 0;
    int withdrawAmount;
    int depositAmount;
    int transferAmount;

    public void checkDetail(){

        int UserId = 900630;
        int PIN = 4321;

        System.out.print("Enter User ID : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        System.out.print("Enter User PIN : ");
        int pin = sc.nextInt();

        if(id == UserId && pin == PIN){
            System.out.println("Login Successfully!");
            menu();
        }else{
            System.out.println("Login Failed!");
            System.out.println();
            System.out.println("Enter Correct Details : ");
            checkDetail();
        }
    }

    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1.Transactions History");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Transfer Money");
        System.out.println("5.Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            transactions();
        }else if (choice == 2){
            withdrawMoney();
        }else if (choice == 3){
            depositMoney();
        }else if (choice == 4){
            transferMoney();
        }else if (choice == 5){
            return;
        }
        else {
            System.out.println("Enter valid choice : ");
        }
    }

    public  void transactions(){
        if(transaction == 0){
            System.out.println("You did not do any transaction");
        }else{
            System.out.println("Deposit Money:" + depositAmount);
            System.out.println("Withdraw Money:" + withdrawAmount);
            System.out.println("Transfer Money:" + transferAmount);
        }

        menu();
    }

    public void withdrawMoney(){
        System.out.print("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        withdrawAmount = sc.nextInt();

        if(withdrawAmount > Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance -= withdrawAmount;
            transaction++;
            System.out.println("Money Withdraw Successful");
            System.out.println("Your Current Balance is : " + Balance);
        }
        menu();
    }

    public void depositMoney(){
        System.out.print("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        depositAmount = sc.nextInt();

        Balance += depositAmount;
        transaction++;
        System.out.println("Money Deposited Successfully");
        System.out.println("Your Current Balance is : " + Balance);

        menu();
    }

    public void transferMoney(){
        System.out.print("Enter amount to transfer : ");
        Scanner sc = new Scanner(System.in);
        transferAmount = sc.nextInt();
        if (transferAmount > Balance) {
            System.out.println("Insufficient amount!");

        } else {
            System.out.print("Enter Account Number : ");
            int accountNumber = sc.nextInt();
            Balance -= transferAmount;
            transaction++;
            System.out.println("Transfer successful!");
            System.out.println("Money Transfer to Account Number : " + accountNumber);
            System.out.println("Your Current Balance is : " + Balance);

            menu();

        }
    }
}
