package com.t1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * A bank account has a balance and an owner who can make 
 * deposits to and withdrawals from the account
 */
public class BankAccount{
    
    //initial balance is set to Zero
    private double balance = 0.0;

    //Name of Owner
    private String owner = "NoName";

    //deposit amount
    private double dwAmount;
    
        public static void main(String[] args) {
            //Call default constructor
            new BankAccount();
    }

    /**
     * Default constructor for a bank account with Zero balance
     */
    public BankAccount(){
        out.println("What do you want to do?");
        out.println("1 Deposit To Your Account");
        out.println("2 Withdraw From Your Account");
        out.println("3 View Your Account Balance");
        out.println("4 Modify Account Owner");
        out.println("5 View Account Owner");
    
        //get user input
        Scanner scanner = new Scanner(System.in);

        //store user input in a variable
        String option = scanner.nextLine();
    
        switch (option) {
            case "1":
                out.println("How much do you want to deposit?");
                dwAmount = Double.parseDouble(scanner.nextLine());
                deposit(dwAmount);
                out.println(getBalance());
                break;
        
            case "2":
                out.println("How much do you want to withdraw?");
                dwAmount = Double.parseDouble(scanner.nextLine());
                withdraw(dwAmount);
                out.println(getBalance());
                break;

            case "3":
                out.println("Your Account Balance is " + getBalance());
                break;

            case "4":
                out.println("Type the new owner name");
                owner = scanner.nextLine();
                modifyOwnerName(owner);
                out.println(getOwnerName());
                break;

            case "5":
                out.println("The Account Owner is " + getOwnerName());
                break;

            default:
                out.println("Hi " + getOwnerName() + ". Your Balance is  " + getBalance());
                break;
        }
    }

    /**
     * Construct a bank account with a given initial balance and owner's name
     * @param initialBalance    the initial balance
     * @param name              name of owner
     */
    public BankAccount(double initialBalance, String name){
        balance = initialBalance;
        owner = name;
    }

    /**
     * Method for depositing money to the bank account
     * @param dAmount   the amount to be depoisted
     */
    public void deposit(double dAmount){
        balance = balance + dAmount;
    }

    /**
     * Method for withdrawing money from the bank account
     * @param wAmount   the amount to be withdrawn
     */
    public void withdraw(double wAmount){
        balance = balance - wAmount;
    }

    /**
     * Mehtod for getting the current balance of the bank account
     * @param return    the current balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Method to change the owner name
     * @param modOwnerName  the new owner name
     */
    public void modifyOwnerName(String modOwnerName){
        owner = modOwnerName;
    }

    /**
     * Method for getting the owner name
     * @param return    the owner name
     */
    public String getOwnerName(){
        return owner;
    }
}